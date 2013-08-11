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

import java.util.Date;
import java.util.List;

/**
 * Model class representing a network feed
 * 
 * @author Werner Keil
 *
 */
public class NetworkFeed {
	
	private List<Actor> actors;
	private String verb;
	private List<FeedObject> objects;
	private List<Group> targets;
	private List<String> ids;
	private String type;
	private Boolean aggregated;
	private String aggregatedBy;
	private List<PossibleAction> possibleActions;
	private Date createdAt;
	private List<String> changes;
	private MetaComment comments;
	private MetaLike likes;

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}

	public String getVerb() {
		return verb;
	}

	public void setVerb(String verb) {
		this.verb = verb;
	}

	public List<FeedObject> getObjects() {
		return objects;
	}

	public void setObjects(List<FeedObject> objects) {
		this.objects = objects;
	}

	public List<Group> getTargets() {
		return targets;
	}

	public void setTargets(List<Group> targets) {
		this.targets = targets;
	}

	public List<String> getIds() {
		return ids;
	}

	public void setIds(List<String> ids) {
		this.ids = ids;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getAggregated() {
		return aggregated;
	}

	public void setAggregated(Boolean aggregated) {
		this.aggregated = aggregated;
	}

	public String getAggregatedBy() {
		return aggregatedBy;
	}

	public void setAggregatedBy(String aggregatedBy) {
		this.aggregatedBy = aggregatedBy;
	}

	public List<PossibleAction> getPossibleActions() {
		return possibleActions;
	}

	public void setPossibleActions(List<PossibleAction> possibleActions) {
		this.possibleActions = possibleActions;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public List<String> getChanges() {
		return changes;
	}

	public void setChanges(List<String> changes) {
		this.changes = changes;
	}

	public MetaComment getComments() {
		return comments;
	}

	public void setComments(MetaComment comments) {
		this.comments = comments;
	}

	public MetaLike getLikes() {
		return likes;
	}

	public void setLikes(MetaLike likes) {
		this.likes = likes;
	}

	/**
	 * List of possible actions
	 * @author Werner Keil
	 *
	 */
	public static enum PossibleAction {
		COMMENT, LIKE, SHARE, DELETE, IGNORE
	}
}