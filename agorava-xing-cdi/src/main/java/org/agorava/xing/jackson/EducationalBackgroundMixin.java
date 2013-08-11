package org.agorava.xing.jackson;

import java.util.List;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.School;

@JsonIgnoreProperties(ignoreUnknown=true)
abstract class EducationalBackgroundMixin {

	@JsonCreator
	 EducationalBackgroundMixin(@JsonProperty("schools")List<School> schools,
								@JsonProperty("qualifications") List<String> qualifications) {}
}
