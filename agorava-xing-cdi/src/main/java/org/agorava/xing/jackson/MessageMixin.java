package org.agorava.xing.jackson;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.User;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class MessageMixin {

	@JsonCreator
	   MessageMixin(@JsonProperty("id") String id,
					@JsonProperty("created_at") Date createdAt,
					@JsonProperty("content") String content,
					@JsonProperty("read") boolean read) {}
	
	@JsonProperty("sender")
	User sender;
}
