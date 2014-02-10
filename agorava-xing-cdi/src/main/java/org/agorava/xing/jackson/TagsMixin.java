package org.agorava.xing.jackson;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class TagsMixin {

	@JsonCreator
	public TagsMixin(@JsonProperty("total") int total, 
					 @JsonProperty("items") Map<String, String> items) {
	}
}
