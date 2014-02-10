package org.agorava.xing.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.Recommendations;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class RecommendationsNodeMixin {

	@JsonCreator
	public RecommendationsNodeMixin(@JsonProperty("user_recommendations") Recommendations recommendations) {
	}
}
