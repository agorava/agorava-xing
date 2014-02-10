package org.agorava.xing.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.Conversation;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ConversationNodeMixin {

	@JsonCreator
	public ConversationNodeMixin(@JsonProperty("conversation") Conversation conversation) {
	}
}
