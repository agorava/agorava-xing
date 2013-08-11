package org.agorava.xing.jackson;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.User;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ContactRequestMixin {

	@JsonCreator
  	 public ContactRequestMixin(@JsonProperty("sender_id") String senderId, 
								@JsonProperty("sender") User sender, 
								@JsonProperty("message") String message, 
								@JsonProperty("received_at") String received_at) {
	}

	@JsonProperty("recipient_id") 
	String recipientId;
}
