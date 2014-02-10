package org.agorava.xing.jackson;

import java.util.List;

import org.agorava.xing.model.Bookmark;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class BookmarksMixin {

	@JsonCreator
	public BookmarksMixin(@JsonProperty("total") int total, 
						  @JsonProperty("items") List<Bookmark> items) {
	}
}
