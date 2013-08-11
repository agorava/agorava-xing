package org.agorava.xing.jackson;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.Tags;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class TagsNodeMixin {

	@JsonCreator
	public TagsNodeMixin(@JsonProperty("tags") Tags tags) {
	}
}
