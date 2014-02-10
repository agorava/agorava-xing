package org.agorava.xing.jackson;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.Recommendation;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class RecommendationsMixin {

	@JsonCreator
	public RecommendationsMixin(@JsonProperty("total") int total, 
								@JsonProperty("recommendations") List<Recommendation> recommendations) {
	}
}
