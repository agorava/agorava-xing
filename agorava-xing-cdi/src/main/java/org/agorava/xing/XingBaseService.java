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

package org.agorava.xing;

import static org.agorava.xing.XingApi.API_ROOT;

import org.agorava.api.oauth.OAuthService;
import org.agorava.api.rest.Api;
import org.agorava.spi.ProviderApiService;
import org.agorava.xing.Xing;

import javax.inject.Inject;

import java.util.HashMap;
import java.util.Map;

/**
 * A specialization of {@link OAuthService} to add XING Related specific methods
 *
 * @author Werner Keil
 */

public abstract class XingBaseService extends ProviderApiService implements Api {

    protected static final char MULTI_VALUE_SEPARATOR = ',';

    @Inject
    @Xing
    private OAuthService service;
    
    public Map<String, String> buildPagingParametersWithCount(int page, int pageSize, long sinceId, long maxId) {
        final Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("page", String.valueOf(page));
        parameters.put("count", String.valueOf(pageSize));
        if (sinceId > 0) {
            parameters.put("since_id", String.valueOf(sinceId));
        }
        if (maxId > 0) {
            parameters.put("max_id", String.valueOf(maxId));
        }
        return parameters;
    }

    public Map<String, String> buildPagingParametersWithPerPage(int page, int pageSize, long sinceId, long maxId) {
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("page", String.valueOf(page));
        parameters.put("per_page", String.valueOf(pageSize));
        if (sinceId > 0) {
            parameters.put("since_id", String.valueOf(sinceId));
        }
        if (maxId > 0) {
            parameters.put("max_id", String.valueOf(maxId));
        }
        return parameters;
    }

    @Override
    public String buildAbsoluteUri(String uri) {
    	StringBuilder b = new StringBuilder(API_ROOT);
    	b.append(uri);
    	/*
    	b.append("?");
    	b.append("oauth_consumer_key={0}");
    	b.append("&oauth_token={1}");
    	b.append("&oauth_timestamp={2}");
    	b.append("&oauth_nonce={3}");
    	//b.append("oauth_consumer_key=");
    	//b.append(service.get)
    	b.append("&");
    	b.append(AgoravaConstants.SIGN_METHOD);
    	b.append("=");
    	b.append(HMAC_SHA1.NAME);
    	//b.append("oauth_signature_method=PLAINTEXT");
    	b.append("&oauth_version=1.0");
    	b.append("&");
    	b.append(AgoravaConstants.SIGNATURE);
    	b.append("={4}");
    	*/
        return b.toString();
    }

    @Override
    public OAuthService getService() {
        return service;
    }
    
    public String getBaseUrl() {
    	return API_ROOT;
    }
}
