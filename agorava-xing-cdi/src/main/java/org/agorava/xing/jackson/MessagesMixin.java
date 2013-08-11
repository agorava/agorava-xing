package org.agorava.xing.jackson;

import java.util.List;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.Message;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MessagesMixin {

	@JsonCreator
	  MessagesMixin(@JsonProperty("total") int total,
					@JsonProperty("items")  List<Message> items) {}
}
