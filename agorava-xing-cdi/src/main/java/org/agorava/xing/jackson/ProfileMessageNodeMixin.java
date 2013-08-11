package org.agorava.xing.jackson;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.ProfileMessage;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ProfileMessageNodeMixin {

	@JsonCreator
	public ProfileMessageNodeMixin(@JsonProperty("profile_message") ProfileMessage profileMessage) {
	}
}
