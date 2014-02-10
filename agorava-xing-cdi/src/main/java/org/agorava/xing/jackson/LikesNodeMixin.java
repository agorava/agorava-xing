package org.agorava.xing.jackson;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.Like;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class LikesNodeMixin {

	@JsonCreator
	public LikesNodeMixin(@JsonProperty("likes") List<Like> likes) {
	}
}
