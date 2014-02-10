package org.agorava.xing.jackson;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.Comment;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class CommentsMixin {

	@JsonCreator
	public CommentsMixin(@JsonProperty("comments") List<Comment> comments) {
	}
}
