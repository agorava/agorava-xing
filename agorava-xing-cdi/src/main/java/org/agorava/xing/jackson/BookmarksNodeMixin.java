package org.agorava.xing.jackson;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.Bookmarks;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class BookmarksNodeMixin {

	@JsonCreator
	public BookmarksNodeMixin(@JsonProperty("bookmarks") Bookmarks bookmarks) {
	}
}
