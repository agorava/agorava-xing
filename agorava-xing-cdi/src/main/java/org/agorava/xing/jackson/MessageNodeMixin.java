package org.agorava.xing.jackson;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.Message;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class MessageNodeMixin {

	@JsonCreator
	public MessageNodeMixin(@JsonProperty("message") Message message) {
	}
}
