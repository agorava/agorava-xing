package org.agorava.xing.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.Contacts;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class SharedContactsNodeMixin {

	@JsonCreator
	public SharedContactsNodeMixin(@JsonProperty("shared_contacts") Contacts contacts) {
	}
}
