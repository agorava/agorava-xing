package org.agorava.xing.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.User;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class NearbyUsersMixin {

	@JsonCreator
	public NearbyUsersMixin(@JsonProperty("updated_at") String updatedAt, 
							@JsonProperty("user") User user, 
							@JsonProperty("distance") long distance) {
	}
}
