package org.agorava.xing.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.Message;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class MessageNodeMixin {

	@JsonCreator
	public MessageNodeMixin(@JsonProperty("message") Message message) {
	}
}
