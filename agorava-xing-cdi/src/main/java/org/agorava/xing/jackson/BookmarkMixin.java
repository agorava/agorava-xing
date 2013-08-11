package org.agorava.xing.jackson;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.User;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class BookmarkMixin {

	@JsonCreator
	public BookmarkMixin(@JsonProperty("created_at") String createdAt, 
						 @JsonProperty("user") User user) {
	}
}
