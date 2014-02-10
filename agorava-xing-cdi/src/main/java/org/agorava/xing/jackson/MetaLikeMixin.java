package org.agorava.xing.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

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
