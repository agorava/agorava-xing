package org.agorava.xing.jackson;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.Comment;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class MetaCommentMixin {

	@JsonCreator
	public MetaCommentMixin() {
	}

	@JsonProperty("type")
	String type;

	@JsonProperty("amount")
	int amount;

	@JsonProperty("current_user_commented")
	boolean currentUserCommented;

	@JsonProperty("latest_comments")
	List<Comment> latestComments;
}
