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

/**
 * Model class representing a user's contact request
 * @author Werner Keil
 */
public class ContactRequest {

	private final String senderId;
	private final User sender;
	private final String message;
	private final String receivedAt;
	private String recipientId;

	public ContactRequest(String senderId, User sender, String message, String receivedAt) {
		this.senderId = senderId;
		this.sender = sender;
		this.message = message;
		this.receivedAt = receivedAt;
	}

	public String getSenderId() {
		return senderId;
	}

	public User getSender() {
		return sender;
	}

	public String getMessage() {
		return message;
	}

	public String getReceivedAt() {
		return receivedAt;
	}

	public String getRecipientId() {
		return recipientId;
	}

	public void setRecipientId(String recipientId) {
		this.recipientId = recipientId;
	}
}
