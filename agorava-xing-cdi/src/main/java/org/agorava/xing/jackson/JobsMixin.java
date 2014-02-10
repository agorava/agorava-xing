package org.agorava.xing.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.Jobs;

@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class JobsMixin {

	@JsonCreator
	  JobsMixin(@JsonProperty("total") int total,
				@JsonProperty("items") Jobs jobs){
	}
}
