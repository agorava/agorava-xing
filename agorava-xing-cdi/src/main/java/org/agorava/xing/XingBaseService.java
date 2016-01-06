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

    public static final String API_ROOT = "https://api.xing.com/v1";
    
    protected static final String BASE_URL = API_ROOT + "people/";

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
        return API_ROOT + uri;
    }

    @Override
    public OAuthService getService() {
        return service;
    }
    
    public String getBaseUrl() {
    	return BASE_URL;
    }
}
