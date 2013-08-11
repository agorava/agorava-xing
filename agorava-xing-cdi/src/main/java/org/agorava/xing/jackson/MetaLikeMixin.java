package org.agorava.xing.jackson;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class MetaLikeMixin {

	@JsonCreator
	public MetaLikeMixin() {
	}

	@JsonProperty("type")
	String type;

	@JsonProperty("amount")
	int amount;

	@JsonProperty("current_user_liked")
	boolean currentUserLiked;
}
