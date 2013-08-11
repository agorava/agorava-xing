package org.agorava.xing.jackson;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.Users;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ContactPathsMixin {

	@JsonCreator
	   public ContactPathsMixin(@JsonProperty("paths") Users paths, 
								@JsonProperty("distance") int distance, 
								@JsonProperty("total") int total) {
	}
}
