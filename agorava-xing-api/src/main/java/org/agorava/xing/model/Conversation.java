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
import java.util.List;

/**
 * A conversation
 * 
 * @author Werner Keil
 */

public class Conversation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7030876104615441305L;
	private final String id;
	private String subject;
	private int messageCount;
	private int unreadMessageCount;
	private String updatedAt;
	private boolean readOnly;
	private List<User> participants;
	private List<Message> latestMessages;

	public Conversation(String id, String subject, int messageCount, int unreadMessageCount, String updatedAt, boolean readOnly) {

		this.id = id;
		this.subject = subject;
		this.messageCount = messageCount;
		this.unreadMessageCount = unreadMessageCount;
		this.updatedAt = updatedAt;
		this.readOnly = readOnly;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMessageCount() {
		return messageCount;
	}

	public void setMessageCount(int messageCount) {
		this.messageCount = messageCount;
	}

	public int getUnreadMessageCount() {
		return unreadMessageCount;
	}

	public void setUnreadMessageCount(int unreadMessageCount) {
		this.unreadMessageCount = unreadMessageCount;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean isReadOnly() {
		return readOnly;
	}

	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}

	public List<User> getParticipants() {
		return participants;
	}

	public void setParticipants(List<User> participants) {
		this.participants = participants;
	}

	public List<Message> getLatestMessages() {
		return latestMessages;
	}

	public void setLatestMessages(List<Message> latestMessages) {
		this.latestMessages = latestMessages;
	}

	public String getId() {
		return id;
	}
}
