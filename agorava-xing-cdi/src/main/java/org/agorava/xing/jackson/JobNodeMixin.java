package org.agorava.xing.jackson;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.Job;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class JobNodeMixin {

	@JsonCreator
	JobNodeMixin(@JsonProperty("job") Job job) {
	}
}
