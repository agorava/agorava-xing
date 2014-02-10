package org.agorava.xing.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.Company;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ContactMixin {

	@JsonCreator
	ContactMixin(@JsonProperty("company") Company company) {
	}
}
