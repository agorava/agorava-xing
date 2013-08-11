package org.agorava.xing.jackson;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class AwardMixin {

	@JsonCreator
	 AwardMixin(@JsonProperty("name") String name,
				@JsonProperty("date_awarded") String dateAwarded,
				@JsonProperty("url") String url) {
		
	}
}
