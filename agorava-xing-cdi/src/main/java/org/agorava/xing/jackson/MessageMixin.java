package org.agorava.xing.jackson;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
