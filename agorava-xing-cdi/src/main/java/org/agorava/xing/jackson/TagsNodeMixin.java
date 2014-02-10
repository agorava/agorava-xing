package org.agorava.xing.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.Tags;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class TagsNodeMixin {

	@JsonCreator
	public TagsNodeMixin(@JsonProperty("tags") Tags tags) {
	}
}
