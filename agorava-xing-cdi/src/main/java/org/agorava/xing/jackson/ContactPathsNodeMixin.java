package org.agorava.xing.jackson;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.ContactPaths;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ContactPathsNodeMixin {

	@JsonCreator
	public ContactPathsNodeMixin(@JsonProperty("contact_paths") ContactPaths contactPaths) {
	}
}
