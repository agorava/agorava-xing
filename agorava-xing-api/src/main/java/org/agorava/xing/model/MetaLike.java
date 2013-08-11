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
 * Meta class representing a like
 * 
 * @author Werner Keil
 *
 */
public class MetaLike extends Like {

	private int amount;
	private boolean currentUserLiked;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public boolean isCurrentUserLiked() {
		return currentUserLiked;
	}

	public void setCurrentUserLiked(boolean currentUserLiked) {
		this.currentUserLiked = currentUserLiked;
	}
}