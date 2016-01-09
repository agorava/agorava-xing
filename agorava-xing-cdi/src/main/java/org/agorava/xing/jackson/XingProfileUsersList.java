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

package org.agorava.xing.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.agorava.xing.model.User;

import java.util.List;

/**
 * Holder for list of Xing User objects pulled from a JSON object's "users" property.
 *
 * @author Werner Keil
 */
@JsonIgnoreProperties(ignoreUnknown = true)
class XingProfileUsersList {

    private final List<User> list;

    @JsonCreator
    public XingProfileUsersList(@JsonProperty("users") List<User> list) {
        this.list = list;
    }

    public List<User> getList() {
        return list;
    }
}
