package org.agorava.xing.jackson;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.Actor;
import org.agorava.xing.model.FeedObject;
import org.agorava.xing.model.Group;
import org.agorava.xing.model.MetaComment;
import org.agorava.xing.model.MetaLike;
import org.agorava.xing.model.NetworkFeed.PossibleAction;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class NetworkFeedMixin {

	@JsonCreator
	public NetworkFeedMixin() {
	}

	@JsonProperty("actors")
	List<Actor> actors;

	@JsonProperty("verb")
	String verb;

	@JsonProperty("objects")
	List<FeedObject> objects;

	@JsonProperty("targets")
	List<Group> targets;

	@JsonProperty("ids")
	List<String> ids;

	@JsonProperty("type")
	String type;

	@JsonProperty("aggregated")
	Boolean aggregated;

	@JsonProperty("aggregated_by")
	String aggregatedBy;

	@JsonProperty("possible_actions")
	List<PossibleAction> possibleActions;

	@JsonProperty("created_at")
	Date createdAt;

	@JsonProperty("changes")
	List<String> changes;

	@JsonProperty("comments")
	MetaComment comments;

	@JsonProperty("likes")
	MetaLike likes;
}
