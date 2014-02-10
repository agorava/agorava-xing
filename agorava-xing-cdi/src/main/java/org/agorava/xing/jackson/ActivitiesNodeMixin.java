package org.agorava.xing.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.NetworkFeed;

@JsonIgnoreProperties
abstract class ActivitiesNodeMixin {

	@JsonCreator
	public ActivitiesNodeMixin() {
	}

	@JsonProperty("activities")
	NetworkFeed activities;
}
