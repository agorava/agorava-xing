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
 * @author Werner Keil
 */

public class Conversations implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7786734137068393257L;
	private int unreadCount;
	private int total;
	private List<Conversation> items;

	public Conversations(int unreadCount, List<Conversation> items, int total) {
		this.unreadCount = unreadCount;
		this.items = items;
		this.total = total;
	}

	public List<Conversation> getItems() {
		return items;
	}

	public int getUnreadCount() {
		return unreadCount;
	}

	public int getTotal() {
		return total;
	}
}
