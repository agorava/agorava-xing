package org.agorava.xing.jackson;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.ContactRequest;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ContactRequestsMixin {

	@JsonCreator
	public ContactRequestsMixin(@JsonProperty("contact_requests") List<ContactRequest> contactRequests) {
	}
}
