package org.agorava.xing.jackson;

import java.util.List;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.Comment;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class CommentsMixin {

	@JsonCreator
	public CommentsMixin(@JsonProperty("comments") List<Comment> comments) {
	}
}
