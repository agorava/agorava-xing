package org.agorava.xing.jackson;

import java.util.List;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
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
