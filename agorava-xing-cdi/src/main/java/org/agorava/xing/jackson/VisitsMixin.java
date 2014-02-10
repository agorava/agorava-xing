package org.agorava.xing.jackson;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.Visit;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class VisitsMixin {

	@JsonCreator
	public VisitsMixin(@JsonProperty("visits") List<Visit> visits) {
	}
}
