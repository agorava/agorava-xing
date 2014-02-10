package org.agorava.xing.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class GroupMixin {

	@JsonCreator
	public GroupMixin() {
	}

	@JsonProperty("type")
	String type;

	@JsonProperty("id")
	String id;

	@JsonProperty("created_at")
	String createdAt;

	@JsonProperty("display_name")
	String displayName;

	@JsonProperty("permalink")
	String permalink;
}
