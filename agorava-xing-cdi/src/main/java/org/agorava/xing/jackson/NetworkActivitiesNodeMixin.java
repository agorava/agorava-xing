package org.agorava.xing.jackson;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.NetworkFeed;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class NetworkActivitiesNodeMixin {

	@JsonCreator
	public NetworkActivitiesNodeMixin(@JsonProperty("network_activities") List<NetworkFeed> networkFeed) {
	}
}
