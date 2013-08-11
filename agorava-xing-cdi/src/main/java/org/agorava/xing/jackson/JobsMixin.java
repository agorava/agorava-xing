package org.agorava.xing.jackson;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.Jobs;

@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class JobsMixin {

	@JsonCreator
	  JobsMixin(@JsonProperty("total") int total,
				@JsonProperty("items") Jobs jobs){
	}
}
