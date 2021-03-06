package org.agorava.xing.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.NearbyItems;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class NearbyItemsNodeMixin {

	@JsonCreator
	public NearbyItemsNodeMixin(@JsonProperty("nearby_items") NearbyItems nearbyItems) {
	}
}
