package org.agorava.xing.jackson;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.Recommendations;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class RecommendationsNodeMixin {

	@JsonCreator
	public RecommendationsNodeMixin(@JsonProperty("user_recommendations") Recommendations recommendations) {
	}
}
