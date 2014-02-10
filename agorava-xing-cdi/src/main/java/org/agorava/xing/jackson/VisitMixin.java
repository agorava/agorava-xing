package org.agorava.xing.jackson;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.PhotoUrls;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class VisitMixin {

	@JsonCreator
	public VisitMixin() {
	}

	@JsonProperty("company_name")
	String companyName;

	@JsonProperty("visited_at_encrypted")
	String visitedAtEncrypted;

	@JsonProperty("reason")
	Map<String, String> reason;

	@JsonProperty("user_id")
	String userId;

	@JsonProperty("photo_urls")
	PhotoUrls photoUrls;

	@JsonProperty("display_name")
	String displayName;

	@JsonProperty("visited_at")
	String visitedAt;
}
