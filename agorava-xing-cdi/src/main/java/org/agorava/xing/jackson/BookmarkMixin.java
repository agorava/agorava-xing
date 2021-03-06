package org.agorava.xing.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.User;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class BookmarkMixin {

	@JsonCreator
	public BookmarkMixin(@JsonProperty("created_at") String createdAt, 
						 @JsonProperty("user") User user) {
	}
}
