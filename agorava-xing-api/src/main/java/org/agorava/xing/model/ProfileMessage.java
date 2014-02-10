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
public class ProfileMessage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8658311463754562228L;
	private final String updatedAt;
	private final String message;

	public ProfileMessage(String updatedAt, String message) {
		this.updatedAt = updatedAt;
		this.message = message;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public String getMessage() {
		return message;
	}
}
