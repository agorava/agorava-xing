/*
 * Copyright 2016 Agorava
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.agorava.xing.impl;

import static org.agorava.xing.XingApi.API_ROOT;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.logging.Logger;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Named;

import org.agorava.api.oauth.Token;
import org.agorava.xing.ProfileService;
import org.agorava.xing.Xing;
import org.agorava.xing.XingBaseService;
import org.agorava.xing.model.ProfileField;
import org.agorava.xing.model.XingProfile;

/**
 * @author Werner Keil
 */

@Named
@Xing
public class XingProfileServiceImpl extends XingBaseService implements ProfileService {
	private static final Logger LOGGER = Logger.getLogger(XingProfileServiceImpl.class.getName());
    protected static final String BASE_URL = API_ROOT + "/users/";
    private static Random RAND = new Random();
    static {
    	// TODO is this needed here?
        StringBuilder b = new StringBuilder();
        b.append(BASE_URL).append("{0}:(");
        boolean first = true;
        for (ProfileField f : ProfileField.values()) {
            switch (f) {
                case CONNECTIONS:
                    break;
                default:
                    if (first) {
                        first = false;
                    } else {
                        b.append(',');
                    }
                    b.append(f);
            }
        }
        b.append(")?format=json");

        PROFILE_URL_FULL = b.toString();
    }

//    static final String PROFILE_URL = BASE_URL
//            + "me.json";
    
    static final String PROFILE_URL_BY_ID = BASE_URL
            + "{0}";

    static final String PROFILE_URL_FULL;

    @Override
    public String getProfileId() {
        return getUserProfile().getId();
    }

    @Override
    public String getProfileUrl() {
        return getUserProfile().getProfileImageUrl();
    }

    @Override
    public XingProfile getUserProfile() {
    	final String uri = buildAbsoluteUri("/users/me.json");
    	LOGGER.warning("Calling getUserProfile: " + uri);
    	
        long timestamp = System.currentTimeMillis() / 1000;
        long nonce = timestamp + RAND.nextInt();

    	XingProfile profile = getService().get(uri, XingProfile.class, getService().getConfig().getApiKey(), 
    			getService().getSession().getAccessToken().getToken(), String.valueOf(timestamp), 
    			String.valueOf(nonce));
    	LOGGER.warning("Got " + profile);
        return profile;
    }

    @Override
    public XingProfile getProfileById(String id) {
        return getService().get(PROFILE_URL_BY_ID, XingProfile.class, id);
    }

    @Override
    public XingProfile getProfileByPublicUrl(String url) {
        return getService().get(buildAbsoluteUri("/users/me.json"), XingProfile.class, url); // TODO probably other URI
    }

    @Override
    public String getBaseUrl() {
    	return BASE_URL;
    }
    
    private static final String HMAC_SHA1 = "HmacSHA1";
    private static final PostParameter OAUTH_SIGNATURE_METHOD = new PostParameter("oauth_signature_method", "HMAC-SHA1");

    /**
     * @param value string to be encoded
     * @return encoded string
     * @see <a href="http://wiki.oauth.net/TestCases">OAuth / TestCases</a>
     * @see <a href="http://groups.google.com/group/oauth/browse_thread/thread/a8398d0521f4ae3d/9d79b698ab217df2?hl=en&lnk=gst&q=space+encoding#9d79b698ab217df2">Space encoding - OAuth | Google Groups</a>
     * @see <a href="http://tools.ietf.org/html/rfc3986#section-2.1">RFC 3986 - Uniform Resource Identifier (URI): Generic Syntax - 2.1. Percent-Encoding</a>
     */
    private static String encode(String value) {
        String encoded = null;
        try {
            encoded = URLEncoder.encode(value, "UTF-8");
        } catch (UnsupportedEncodingException ignore) {
        }
        StringBuffer buf = new StringBuffer(encoded.length());
        char focus;
        for (int i = 0; i < encoded.length(); i++) {
            focus = encoded.charAt(i);
            if (focus == '*') {
                buf.append("%2A");
            } else if (focus == '+') {
                buf.append("%20");
            } else if (focus == '%' && i + 1 < encoded.length()
                    && encoded.charAt(i + 1) == '7' && encoded.charAt(i + 2) == 'E') {
                buf.append('~');
                i += 2;
            } else {
                buf.append(focus);
            }
        }
        return buf.toString();
    }
    
    /**
     * Computes RFC 2104-compliant HMAC signature.
     *
     * @param data the data to be signed
     * @return signature
     * @see <a href="http://oauth.net/core/1.0/#rfc.section.9.2.1">OAuth Core - 9.2.1.  Generating Signature</a>
     */
    private String generateSignature(String data, Token token, String consumerSecret) {
        byte[] byteHMAC = null;
        try {
            Mac mac = Mac.getInstance(HMAC_SHA1);
            SecretKeySpec spec;
            if (null == token) {
                String oauthSignature = encode(consumerSecret) + '&';
                spec = new SecretKeySpec(oauthSignature.getBytes(), HMAC_SHA1);
            } else {
//                if (null == token.getSecretKeySpec()) {
                    String oauthSignature = encode(consumerSecret) + '&' + encode(token.getSecret());
                    spec = new SecretKeySpec(oauthSignature.getBytes(), HMAC_SHA1);
//                    token.setSecretKeySpec(spec);
//                }
//                spec = token.getSecretKeySpec();
            }
            mac.init(spec);
            byteHMAC = mac.doFinal(data.getBytes());
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException ignore) {
            // should never happen
        }
        return new BASE64Encoder().encode(byteHMAC);
    }
}
