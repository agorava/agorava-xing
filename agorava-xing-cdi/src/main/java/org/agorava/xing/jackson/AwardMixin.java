package org.agorava.xing.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class AwardMixin {

	@JsonCreator
	 AwardMixin(@JsonProperty("name") String name,
				@JsonProperty("date_awarded") String dateAwarded,
				@JsonProperty("url") String url) {
		
	}
}
