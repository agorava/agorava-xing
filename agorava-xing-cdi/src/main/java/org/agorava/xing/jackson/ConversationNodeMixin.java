package org.agorava.xing.jackson;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.Conversation;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ConversationNodeMixin {

	@JsonCreator
	public ConversationNodeMixin(@JsonProperty("conversation") Conversation conversation) {
	}
}
