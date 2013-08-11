package org.agorava.xing.jackson;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ProfileMessageMixin {

	@JsonCreator
	 public ProfileMessageMixin(@JsonProperty("updated_at") String updatedAt,
								@JsonProperty("message") String messsage) {
	}
}
