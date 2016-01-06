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

import com.fasterxml.jackson.databind.JsonNode;

import org.agorava.xing.UserService;
import org.agorava.xing.Xing;
import org.agorava.xing.XingBaseService;
import org.agorava.xing.model.XingProfile;

import javax.inject.Named;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author Werner Keil
 */
@Xing
@Named
public class XingUserServiceImpl extends XingBaseService implements UserService {
	private static Logger LOGGER = Logger.getLogger(XingUserServiceImpl.class.getName());
	static final String USERS_URL = API_ROOT + "/users/{id}.json";

    @Override
    public XingProfile getUserProfile() {
    	LOGGER.warning("Entered getUserProfile");
        return getUserProfile("me");
    }

    @Override
    public XingProfile getUserProfile(String id) {
    	LOGGER.warning("Entered getUserProfile(id)");
        return (XingProfile) getService().getSession().getUserProfile();
    }

    @Override
    public List<String> getUserPermissions() {
    	LOGGER.warning("Entered getUserPermissions");
        JsonNode responseNode = getService().get("https://api.xing.com/v1/users/me", JsonNode.class);
        return deserializePermissionsNodeToList(responseNode);
    }

    private List<String> deserializePermissionsNodeToList(JsonNode jsonNode) {
        JsonNode dataNode = jsonNode.get("data");
        List<String> permissions = new ArrayList<String>();
        for (Iterator<JsonNode> elementIt = dataNode.elements(); elementIt.hasNext(); ) {
            JsonNode permissionsElement = elementIt.next();
            for (Iterator<String> fieldNamesIt = permissionsElement.fieldNames(); fieldNamesIt.hasNext(); ) {
                permissions.add(fieldNamesIt.next());
            }
        }
        return permissions;
    }

	@Override
	public byte[] getUserProfileImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] getUserProfileImage(String userId) {
		// TODO Auto-generated method stub
		return null;
	}
}
