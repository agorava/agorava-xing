package org.agorava.xing.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.ProfileMessage;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ProfileMessageNodeMixin {

	@JsonCreator
	public ProfileMessageNodeMixin(@JsonProperty("profile_message") ProfileMessage profileMessage) {
	}
}
