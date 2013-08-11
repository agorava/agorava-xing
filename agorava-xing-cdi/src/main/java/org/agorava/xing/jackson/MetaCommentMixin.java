package org.agorava.xing.jackson;

import java.util.List;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
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
