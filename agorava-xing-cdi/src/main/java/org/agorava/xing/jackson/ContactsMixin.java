package org.agorava.xing.jackson;

import java.util.List;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.User;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ContactsMixin {

	@JsonCreator
	public ContactsMixin(@JsonProperty("total") int total, 
						 @JsonProperty("users") List<User> users) {
	}
}
