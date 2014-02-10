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
import java.util.Map;

/**
 * @author Werner Keil
 */
public class Visit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1356076796298613644L;
	private String companyName;
	private String visitedAtEncrypted;
	private Map<String, String> reason;
	private String userId;
	private PhotoUrls photoUrls;
	private String displayName;
	private String visitedAt;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getVisitedAtEncrypted() {
		return visitedAtEncrypted;
	}

	public void setVisitedAtEncrypted(String visitedAtEncrypted) {
		this.visitedAtEncrypted = visitedAtEncrypted;
	}

	public Map<String, String> getReason() {
		return reason;
	}

	public void setReason(Map<String, String> reason) {
		this.reason = reason;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public PhotoUrls getPhotoUrls() {
		return photoUrls;
	}

	public void setPhotoUrls(PhotoUrls photoUrls) {
		this.photoUrls = photoUrls;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getVisitedAt() {
		return visitedAt;
	}

	public void setVisitedAt(String visitedAt) {
		this.visitedAt = visitedAt;
	}
}
