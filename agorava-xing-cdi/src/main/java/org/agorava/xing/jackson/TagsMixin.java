package org.agorava.xing.jackson;

import java.util.Map;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class TagsMixin {

	@JsonCreator
	public TagsMixin(@JsonProperty("total") int total, 
					 @JsonProperty("items") Map<String, String> items) {
	}
}
