package org.agorava.xing.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class GeoCodeMixin {

	@JsonCreator
	   GeoCodeMixin(@JsonProperty("accuracy") String accuracy, 
					@JsonProperty("latitude") String latitude,
					@JsonProperty("longitude") String longitude) {
	}
}
