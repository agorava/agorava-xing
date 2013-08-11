package org.agorava.xing.jackson;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.Jobs;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class JobsNodeMixin {

	@JsonCreator
	JobsNodeMixin(@JsonProperty("jobs") Jobs jobs) {
	}
}
