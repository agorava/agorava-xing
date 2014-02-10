package org.agorava.xing.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class TimeZoneMixin {

	@JsonCreator
  	  TimeZoneMixin(@JsonProperty("name")String name,
					@JsonProperty("utcOffset") double utcOffset) {}
}
