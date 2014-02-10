package org.agorava.xing.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.Conversations;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ConversationsNodeMixin {

	@JsonCreator
	ConversationsNodeMixin(@JsonProperty("conversations") Conversations conversations) {
	}
}
