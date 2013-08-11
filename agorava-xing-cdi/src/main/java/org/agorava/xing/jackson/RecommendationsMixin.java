package org.agorava.xing.jackson;

import java.util.List;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.Recommendation;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class RecommendationsMixin {

	@JsonCreator
	public RecommendationsMixin(@JsonProperty("total") int total, 
								@JsonProperty("recommendations") List<Recommendation> recommendations) {
	}
}
