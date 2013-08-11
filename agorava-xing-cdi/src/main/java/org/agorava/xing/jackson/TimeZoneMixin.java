package org.agorava.xing.jackson;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class TimeZoneMixin {

	@JsonCreator
  	  TimeZoneMixin(@JsonProperty("name")String name,
					@JsonProperty("utcOffset") double utcOffset) {}
}
