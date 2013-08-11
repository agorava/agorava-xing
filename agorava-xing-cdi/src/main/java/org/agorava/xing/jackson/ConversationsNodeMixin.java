package org.agorava.xing.jackson;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.Conversations;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ConversationsNodeMixin {

	@JsonCreator
	ConversationsNodeMixin(@JsonProperty("conversations") Conversations conversations) {
	}
}
