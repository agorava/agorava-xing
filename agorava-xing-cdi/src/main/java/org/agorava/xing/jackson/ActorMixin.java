package org.agorava.xing.jackson;


import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreType(value = true)
abstract class ActorMixin {

	@com.fasterxml.jackson.annotation.JsonCreator
	public ActorMixin() {
	}

	@JsonProperty("type")
	String type;

	@JsonProperty("id")
	String id;

	@JsonProperty("created_at")
	String createdAt;

	@JsonProperty("name")
	String name;

	@JsonProperty("permalink")
	String permalink;

	@JsonProperty("photo")
	String photo;

}
