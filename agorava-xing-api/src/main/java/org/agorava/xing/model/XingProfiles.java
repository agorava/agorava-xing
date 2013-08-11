/*
 * Copyright 2013 Agorava
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

package org.agorava.xing.model;

import java.util.List;

/**
 * List of multiple XING profiles.
 *
 * @author Werner Keil
 */
public class XingProfiles {

    private List<XingProfile> profiles;

    public XingProfiles(List<XingProfile> profiles) {
        this.profiles = profiles;
    }

    public List<XingProfile> getProfiles() {
        return profiles;
    }
}
