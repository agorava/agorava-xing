package org.agorava.xing.jackson;

import java.util.List;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.NetworkFeed;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class NetworkActivitiesNodeMixin {

	@JsonCreator
	public NetworkActivitiesNodeMixin(@JsonProperty("network_activities") List<NetworkFeed> networkFeed) {
	}
}
