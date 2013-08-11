package org.agorava.xing.jackson;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ActorMixin {

	@JsonCreator
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
