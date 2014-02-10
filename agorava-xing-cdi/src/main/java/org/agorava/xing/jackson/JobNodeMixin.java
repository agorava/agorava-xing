package org.agorava.xing.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.Job;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class JobNodeMixin {

	@JsonCreator
	JobNodeMixin(@JsonProperty("job") Job job) {
	}
}
