package org.agorava.xing.jackson;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.User;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ContactsMixin {

	@JsonCreator
	public ContactsMixin(@JsonProperty("total") int total, 
						 @JsonProperty("users") List<User> users) {
	}
}
