package org.agorava.xing.jackson;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.Message;
import org.agorava.xing.model.User;

@JsonIgnoreProperties(ignoreUnknown=true)
abstract class ConversationMixin {

	@JsonCreator
	  ConversationMixin(@JsonProperty("id") String id,
						@JsonProperty("subject") String subject,
						@JsonProperty("message_count") int messageCount,
						@JsonProperty("unread_message_count") int unreadMessageCount,
						@JsonProperty("updated_at") String updatedAt,
						@JsonProperty("read_only") boolean readOnly){}
	
	@JsonProperty("participants")
	List<User> participants;
	
	@JsonProperty("latest_messages")
	List<Message> latestMessages;
}
