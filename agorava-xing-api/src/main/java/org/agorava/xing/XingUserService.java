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

import org.agorava.spi.UserProfileService;
import org.agorava.xing.model.User;

/**
 * Operations on Profile API
 *
 * @author Werner Keil
 * @author Antoine Sabot-Durand
 */
public interface XingUserService extends UserProfileService {

    /**
     * Retrieves the user's XING profile ID.
     *
     * @return the user's XING profile ID.
     */
    String getProfileId();

    /**
     * Retrieves a URL to the user's public profile page.
     *
     * @return a URL to the user's public profile page.
     */
    String getProfileUrl();

    /**
     * Retrieves the current user's profile details.
     *
     * @return the user's profile data.
     */
    User getUserProfile();

    /**
     * Retrieves a profile by id.
     *
     * @return the user's profile data.
     */
    User getProfileById(String id);

    /**
     * Retrieves a profile by public url.
     *
     * @return the user's profile data.
     */
    User getProfileByPublicUrl(String url);

}
