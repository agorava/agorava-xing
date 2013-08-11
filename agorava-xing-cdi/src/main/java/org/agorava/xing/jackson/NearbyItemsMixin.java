package org.agorava.xing.jackson;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.NearbyItems;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class NearbyItemsMixin {

	@JsonCreator
	public NearbyItemsMixin(@JsonProperty("nearby_items") NearbyItems nearbyItems) {
	}
}
