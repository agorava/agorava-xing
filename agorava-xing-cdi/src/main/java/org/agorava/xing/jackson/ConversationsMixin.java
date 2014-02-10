package org.agorava.xing.jackson;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.Conversation;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ConversationsMixin {

	@JsonCreator
	ConversationsMixin(@JsonProperty("unread_count") String unreadCount,
					   @JsonProperty("items") List<Conversation> items,
					   @JsonProperty("total") String total) {
		
	}
}
