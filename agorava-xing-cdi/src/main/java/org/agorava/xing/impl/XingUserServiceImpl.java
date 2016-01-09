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

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.inject.Named;

import org.agorava.xing.XingUserService;
import org.agorava.xing.Xing;
import org.agorava.xing.XingBaseService;
import org.agorava.xing.model.ProfileField;
import org.agorava.xing.model.User;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Werner Keil
 */

@Named
@Xing
public class XingUserServiceImpl extends XingBaseService implements XingUserService {
	/**
     * Typed list of Xing User profile. This helps Jackson know which type to deserialize list contents into.
     *
     * @author Werner Keil
     * @author Antoine Sabot-Durand
     */
    @SuppressWarnings("serial")
    static class XingProfileList extends ArrayList<User> {
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class XingProfileUsersList {

        private final List<User> list;

        @JsonCreator
        public XingProfileUsersList(@JsonProperty("users") List<User> list) {
            this.list = list;
        }

        public List<User> getList() {
            return list;
        }
    }
    
	private static final Logger LOGGER = Logger.getLogger(XingUserServiceImpl.class.getName());
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
    	LOGGER.info("Calling getUserProfile: " + uri);
    	
    	/*
    	Users users = getService().get(uri, Users.class, true);
    	if (users != null) {
    		LOGGER.info("Got " + users);
    		if (users.getUsers() != null && users.getUsers().size() > 0) {
    			LOGGER.info("Found " + users.getUsers().size() + " users.");
    			return users.getUsers().get(0);
    		} else {
    			LOGGER.warning("No users found");
    		}
    	} else {
    		LOGGER.warning("No users found");
    	}
        return new User("-1");
        */
    	
//    	return getService().get(buildUri(LOOKUP, "user_id", joinedIds), TwitterProfileList.class);
//    	
//    	User user = getService().get(uri, User.class, true);
//    	LOGGER.info("Got " + user);
//    	return user;
    	
    	XingProfileUsersList list = getService().get(uri, XingProfileUsersList.class, true);
    	if (list != null) {
    		List<User> users = list.getList();
	    	if (users != null) {
	    		LOGGER.info("Got " + users);
	    		if (users.size() > 0) {
	    			LOGGER.info("Found " + users.size() + " users.");
	    			return users.get(0);
	    		} else {
	    			LOGGER.warning("No users found");
	    		}
	    	} else {
	    		LOGGER.warning("No users found");
	    	}
    	} else {
    		LOGGER.warning("No list found");
    	}
        return new User("-1");
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
}
