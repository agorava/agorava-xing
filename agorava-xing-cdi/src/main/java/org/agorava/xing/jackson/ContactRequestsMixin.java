package org.agorava.xing.jackson;

import java.util.List;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.ContactRequest;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ContactRequestsMixin {

	@JsonCreator
	public ContactRequestsMixin(@JsonProperty("contact_requests") List<ContactRequest> contactRequests) {
	}
}
