package org.agorava.xing.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ProfileMessageMixin {

	@JsonCreator
	 public ProfileMessageMixin(@JsonProperty("updated_at") String updatedAt,
								@JsonProperty("message") String messsage) {
	}
}
