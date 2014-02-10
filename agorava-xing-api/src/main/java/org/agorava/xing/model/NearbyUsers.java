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

package org.agorava.xing.model;

import java.io.Serializable;

/**
 * @author Werner Keil
 */

public class NearbyUsers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5222376215569082734L;
	private final String updatedAt;
	private final User user;
	private final long distance;

	public NearbyUsers(String updatedAt, User user, long distance) {
		super();
		this.updatedAt = updatedAt;
		this.user = user;
		this.distance = distance;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public User getUser() {
		return user;
	}

	public long getDistance() {
		return distance;
	}

}
