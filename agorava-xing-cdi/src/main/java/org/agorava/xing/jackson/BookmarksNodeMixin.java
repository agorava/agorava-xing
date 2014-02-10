package org.agorava.xing.jackson;

import org.agorava.xing.model.Bookmarks;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class BookmarksNodeMixin {

	@JsonCreator
	public BookmarksNodeMixin(@JsonProperty("bookmarks") Bookmarks bookmarks) {
	}
}
