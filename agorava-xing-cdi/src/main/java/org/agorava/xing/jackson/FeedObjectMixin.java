package org.agorava.xing.jackson;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.User;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class FeedObjectMixin {

	@JsonCreator
	public FeedObjectMixin() {
	}

	@JsonProperty("type")
	String type;

	@JsonProperty("id")
	String id;

	@JsonProperty("creator")
	User creator;

	@JsonProperty("created_at")
	Date createdAt;

	@JsonProperty("title")
	String title;

	@JsonProperty("url")
	String url;

	@JsonProperty("description")
	String description;

	@JsonProperty("image")
	String image;

	@JsonProperty("bookmark_type")
	String bookmarkType;

	@JsonProperty("display_name")
	String displayName;

	@JsonProperty("permalink")
	String permalink;

	@JsonProperty("name")
	String name;

	@JsonProperty("photo")
	String photo;

	@JsonProperty("content")
	String content;
}
