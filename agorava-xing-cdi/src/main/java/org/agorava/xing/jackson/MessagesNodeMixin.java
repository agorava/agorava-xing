package org.agorava.xing.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.Messages;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class MessagesNodeMixin {

	@JsonCreator
	public MessagesNodeMixin(@JsonProperty("messages") Messages messages) {
	}
}
