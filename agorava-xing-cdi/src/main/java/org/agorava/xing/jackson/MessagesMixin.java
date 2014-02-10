package org.agorava.xing.jackson;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.Message;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MessagesMixin {

	@JsonCreator
	  MessagesMixin(@JsonProperty("total") int total,
					@JsonProperty("items")  List<Message> items) {}
}
