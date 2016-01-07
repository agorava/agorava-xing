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
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Named;

import org.agorava.AgoravaConstants;
import org.agorava.api.oauth.Token;
import org.agorava.api.rest.Verb;
import org.agorava.xing.ProfileService;
import org.agorava.xing.Xing;
import org.agorava.xing.XingBaseService;
import org.agorava.xing.model.ProfileField;
import org.agorava.xing.model.User;
import org.agorava.xing.model.Users;
import org.agorava.xing.model.XingProfile;

import com.sun.jersey.core.util.Base64;
import com.sun.jersey.oauth.signature.HMAC_SHA1;

/**
 * @author Werner Keil
 */

@Named
@Xing
public class XingProfileServiceImpl extends XingBaseService implements ProfileService {
	private static final Logger LOGGER = Logger.getLogger(XingProfileServiceImpl.class.getName());
    protected static final String BASE_URL = API_ROOT + "/users/";

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
    public User getUserProfile() {
//    	final String uri = buildAbsoluteUri("/users/me.json");
    	final String uri = buildAbsoluteUri("/users/me");
    	LOGGER.warning("Calling getUserProfile: " + uri);
    	/*
        long timestamp = System.currentTimeMillis() / 1000;
        //long nonce = timestamp + RAND.nextInt();
        String nonce = UUID.randomUUID().toString();
//        String signature = "";
        String header = generateAuthorizationHeader(Verb.GET.name(), uri, null, 
        		getService().getConfig().getApiKey(), getService().getConfig().getApiSecret(), 
        		nonce,  String.valueOf(timestamp), getService().getSession().getAccessToken()
        		);
  //  	XingProfile profile = getService().get(uri, XingProfile.class, getService().getConfig().getApiKey(), 
  //  			getService().getSession().getAccessToken().getToken(), String.valueOf(timestamp), 
  //  			nonce, signature); 
        LOGGER.warning("Header: " + header);
        XingProfile profile = getService().get(header, XingProfile.class, true);
        */
    	
    	/*
    	Users users = getService().get(uri, Users.class, true);
    	if (users != null) {
    		LOGGER.warning("Got " + users);
    		if (users.getUsers() != null && users.getUsers().size() > 0) {
    			LOGGER.warning("Found " + users.getUsers().size() + " users.");
    			return users.getUsers().get(0);
    		} else {
    			LOGGER.warning("No users found");
    		}
    	} else {
    		LOGGER.warning("No users found");
    	}
        return new User("-1");
        */
    	User user = getService().get(uri, User.class, true);
    	LOGGER.warning("Got " + user);
    	return user;
    }

    @Override
    public User getProfileById(String id) {
        return getService().get(PROFILE_URL_BY_ID, User.class, id);
    }

    @Override
    public User getProfileByPublicUrl(String url) {
        return getService().get(buildAbsoluteUri("/users/me.json"), User.class, url); // TODO probably other URI
    }

    @Override
    public String getBaseUrl() {
    	return BASE_URL;
    }
    
    private static final String HMAC_SHA1_ALGORITHM = "HmacSHA1";
    private static final PostParameter OAUTH_SIGNATURE_METHOD = new PostParameter(
    		AgoravaConstants.SIGN_METHOD, HMAC_SHA1.NAME);
    private static final PostParameter[] EMPTY_POST_PARAMETER_ARRAY = new PostParameter[0];

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
     * @param postParams parameters to be enocded and concatenated
     * @return eoncoded string
     * @see <a href="http://wiki.oauth.net/TestCases">OAuth / TestCases</a>
     * @see <a href="http://groups.google.com/group/oauth/browse_thread/thread/a8398d0521f4ae3d/9d79b698ab217df2?hl=en&lnk=gst&q=space+encoding#9d79b698ab217df2">Space encoding - OAuth | Google Groups</a>
     */
    private static String encodeParameters(List<PostParameter> postParams) {
        return encodeParameters(postParams, "&", false);
    }

    private static String encodeParameters(List<PostParameter> postParams, String splitter, boolean quot) {
        StringBuffer buf = new StringBuffer();
        for (PostParameter param : postParams) {
            if (buf.length() != 0) {
                if (quot) {
                    buf.append('\"');
                }
                buf.append(splitter);
            }
            buf.append(encode(param.name)).append('=');
            if (quot) {
                buf.append('\"');
            }
            buf.append(
                    encode(param.value));
        }
        if (buf.length() != 0) {
            if (quot) {
                buf.append('\"');
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
            Mac mac = Mac.getInstance(HMAC_SHA1_ALGORITHM);
            SecretKeySpec spec;
            if (null == token) {
                String oauthSignature = encode(consumerSecret) + '&';
                spec = new SecretKeySpec(oauthSignature.getBytes(), HMAC_SHA1_ALGORITHM);
            } else {
//                if (null == token.getSecretKeySpec()) {
                    String oauthSignature = encode(consumerSecret) + '&' + encode(token.getSecret());
                    spec = new SecretKeySpec(oauthSignature.getBytes(), HMAC_SHA1_ALGORITHM);
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
        return new String(Base64.encode(byteHMAC));
    }
    
    /**
     * The request parameters are collected, sorted and concatenated into a normalized string:<br>
     * •	Parameters in the OAuth HTTP Authorization header excluding the realm parameter.<br>
     * •	Parameters in the HTTP POST request body (with a content-type of application/x-www-form-urlencoded).<br>
     * •	HTTP GET parameters added to the URLs in the query part (as defined by [RFC3986] section 3).<br>
     * <br>
     * The oauth_signature parameter MUST be excluded.<br>
     * The parameters are normalized into a single string as follows:<br>
     * 1.	Parameters are sorted by name, using lexicographical byte value ordering. If two or more parameters share the same name, they are sorted by their value. For example:<br>
     * 2.	                    a=1, c=hi%20there, f=25, f=50, f=a, z=p, z=t<br>
     * 3.	<br>
     * 4.	Parameters are concatenated in their sorted order into a single string. For each parameter, the name is separated from the corresponding value by an ‘=’ character (ASCII code 61), even if the value is empty. Each name-value pair is separated by an ‘&’ character (ASCII code 38). For example:<br>
     * 5.	                    a=1&c=hi%20there&f=25&f=50&f=a&z=p&z=t<br>
     * 6.	<br>
     *
     * @param params parameters to be normalized and concatenated
     * @return nomarized and concatenated parameters
     * @see <a href="http://oauth.net/core/1.0#rfc.section.9.1.1">OAuth Core - 9.1.1.  Normalize Request Parameters</a>
     */
    private static String normalizeRequestParameters(PostParameter[] params) {
        return normalizeRequestParameters(toParamList(params));
    }
    
    private static String normalizeRequestParameters(List<PostParameter> params) {
        Collections.sort(params);
        return encodeParameters(params);
    }
    
    /**
     * The Signature Base String includes the request absolute URL, tying the signature to a specific endpoint. The URL used in the Signature Base String MUST include the scheme, authority, and path, and MUST exclude the query and fragment as defined by [RFC3986] section 3.<br>
     * If the absolute request URL is not available to the Service Provider (it is always available to the Consumer), it can be constructed by combining the scheme being used, the HTTP Host header, and the relative HTTP request URL. If the Host header is not available, the Service Provider SHOULD use the host name communicated to the Consumer in the documentation or other means.<br>
     * The Service Provider SHOULD document the form of URL used in the Signature Base String to avoid ambiguity due to URL normalization. Unless specified, URL scheme and authority MUST be lowercase and include the port number; http default port 80 and https default port 443 MUST be excluded.<br>
     * <br>
     * For example, the request:<br>
     * HTTP://Example.com:80/resource?id=123<br>
     * Is included in the Signature Base String as:<br>
     * http://example.com/resource
     *
     * @param url the url to be normalized
     * @return the Signature Base String
     * @see <a href="http://oauth.net/core/1.0#rfc.section.9.1.2">OAuth Core - 9.1.2.  Construct Request URL</a>
     */
    private static String constructRequestURL(String url) {
        int index = url.indexOf("?");
        if (-1 != index) {
            url = url.substring(0, index);
        }
        int slashIndex = url.indexOf("/", 8);
        String baseURL = url.substring(0, slashIndex).toLowerCase();
        int colonIndex = baseURL.indexOf(":", 8);
        if (-1 != colonIndex) {
            // url contains port number
            if (baseURL.startsWith("http://") && baseURL.endsWith(":80")) {
                // http default port 80 MUST be excluded
                baseURL = baseURL.substring(0, colonIndex);
            } else if (baseURL.startsWith("https://") && baseURL.endsWith(":443")) {
                // http default port 443 MUST be excluded
                baseURL = baseURL.substring(0, colonIndex);
            }
        }
        url = baseURL + url.substring(slashIndex);

        return url;
    }
    
    private static List<PostParameter> toParamList(PostParameter[] params) {
        List<PostParameter> paramList = new ArrayList<PostParameter>(params.length);
        paramList.addAll(Arrays.asList(params));
        return paramList;
    }
    
    private static void parseGetParameters(String url, List<PostParameter> signatureBaseParams) {
        int queryStart = url.indexOf("?");
        if (-1 != queryStart) {
            String[] queryStrs = url.substring(queryStart + 1).split("&");
            try {
                for (String query : queryStrs) {
                    String[] split = query.split("=");
                    if (split.length == 2) {
                        signatureBaseParams.add(
                                new PostParameter(URLDecoder.decode(split[0],
                                        "UTF-8"), URLDecoder.decode(split[1],
                                        "UTF-8")));
                    } else {
                        signatureBaseParams.add(
                                new PostParameter(URLDecoder.decode(split[0],
                                        "UTF-8"), ""));
                    }
                }
            } catch (UnsupportedEncodingException ignore) {
            }

        }

    }
    
    String generateAuthorizationHeader(String method, String url, PostParameter[] params, String consumerKey, String consumerSecret, String nonce, String timestamp, Token otoken) {
        if (null == params) {
            params = EMPTY_POST_PARAMETER_ARRAY;
        }
        List<PostParameter> oauthHeaderParams = new ArrayList<PostParameter>(5);
        oauthHeaderParams.add(new PostParameter("oauth_consumer_key", consumerKey));
        oauthHeaderParams.add(OAUTH_SIGNATURE_METHOD);
        oauthHeaderParams.add(new PostParameter("oauth_timestamp", timestamp));
        oauthHeaderParams.add(new PostParameter("oauth_nonce", nonce));
        oauthHeaderParams.add(new PostParameter("oauth_version", "1.0"));
        if (null != otoken) {
            oauthHeaderParams.add(new PostParameter("oauth_token", otoken.getToken()));
        }
        List<PostParameter> signatureBaseParams = new ArrayList<PostParameter>(oauthHeaderParams.size() + params.length);
        signatureBaseParams.addAll(oauthHeaderParams);
        signatureBaseParams.addAll(toParamList(params));
        parseGetParameters(url, signatureBaseParams);
        StringBuilder base = new StringBuilder(method).append('&')
                .append(encode(constructRequestURL(url))).append('&');
//        StringBuilder base = new StringBuilder(constructRequestURL(url)).append("?");
//        base.append(encode(normalizeRequestParameters(signatureBaseParams)));
        base.append(normalizeRequestParameters(signatureBaseParams));
        String oauthBaseString = base.toString();
//        LOGGER.warning("OAuth base string: " + oauthBaseString); // TODO change to finer/finest
        System.out.println("(if your curious it looks like this: " + otoken + " )");
        String signature = generateSignature(oauthBaseString, otoken, consumerSecret);
        LOGGER.warning("OAuth signature: " + signature); // TODO change to finer/finest

        oauthHeaderParams.add(new PostParameter("oauth_signature", signature));
        //return "OAuth " + encodeParameters(oauthHeaderParams, ",", true);
        StringBuilder sb = new StringBuilder(constructRequestURL(url)).append("?");
        sb.append(normalizeRequestParameters(signatureBaseParams));
        sb.append("&");
        sb.append("oauth_signature=");
        sb.append(signature);
        final String header = sb.toString();
        LOGGER.warning("OAuth header: " + header);
        return header;
    }
}
