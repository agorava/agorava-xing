package org.agorava.xing.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.ContactPaths;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ContactPathsNodeMixin {

	@JsonCreator
	public ContactPathsNodeMixin(@JsonProperty("contact_paths") ContactPaths contactPaths) {
	}
}
