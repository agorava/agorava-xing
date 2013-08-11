package org.agorava.xing.jackson;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.NetworkFeed;

@JsonIgnoreProperties
abstract class ActivitiesNodeMixin {

	@JsonCreator
	public ActivitiesNodeMixin() {
	}

	@JsonProperty("activities")
	NetworkFeed activities;
}
