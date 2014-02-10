package org.agorava.xing.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class LikeMixin {

	@JsonCreator
	public LikeMixin() {
	}

	@JsonProperty("type")
	String type;

	@JsonProperty("id")
	String id;
}
