package org.agorava.xing.jackson;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.Messages;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class MessagesNodeMixin {

	@JsonCreator
	public MessagesNodeMixin(@JsonProperty("messages") Messages messages) {
	}
}
