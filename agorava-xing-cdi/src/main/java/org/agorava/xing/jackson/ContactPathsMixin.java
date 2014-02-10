package org.agorava.xing.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.Users;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ContactPathsMixin {

	@JsonCreator
	   public ContactPathsMixin(@JsonProperty("paths") Users paths, 
								@JsonProperty("distance") int distance, 
								@JsonProperty("total") int total) {
	}
}
