/*
 * Copyright 2014 Agorava
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

/**
 *
 */
package org.agorava.xing.impl;

import javax.inject.Named;

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
public class ProfileServiceImpl extends XingBaseService implements ProfileService {

    static {
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

    static final String PROFILE_URL = BASE_URL
            + "{0}:(id,first-name,last-name,headline,industry,site-standard-profile-request,public-profile-url,picture-url," +
            "summary)?format=json";

    static final String PROFILE_URL_FULL;

    static final String PEOPLE_SEARCH_URL = "https://api.linkedin.com/v1/people-search:(people:(id,first-name,last-name," +
            "headline,industry,site-standard-profile-request,public-profile-url,picture-url,summary," +
            "api-standard-profile-request))?{&keywords}{&first-name}{&last-name}{&company-name}{&current-company}{&title" +
            "}{&current-title}{&school-name}{&current-school}{&country-code}{&postal-code}{&distance}{&start}{&count}{&sort}";


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
        return getService().get(PROFILE_URL, XingProfile.class, "~");
    }

    @Override
    public XingProfile getProfileById(String id) {
        return getService().get(PROFILE_URL, XingProfile.class, id);
    }

    @Override
    public XingProfile getProfileByPublicUrl(String url) {
        return getService().get(PROFILE_URL, XingProfile.class, url);
    }

}
