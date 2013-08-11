package org.agorava.xing.jackson;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.Company;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ContactMixin {

	@JsonCreator
	ContactMixin(@JsonProperty("company") Company company) {
	}
}
