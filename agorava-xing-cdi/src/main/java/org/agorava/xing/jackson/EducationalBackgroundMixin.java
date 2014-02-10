package org.agorava.xing.jackson;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.agorava.xing.model.School;

@JsonIgnoreProperties(ignoreUnknown=true)
abstract class EducationalBackgroundMixin {

	@JsonCreator
	 EducationalBackgroundMixin(@JsonProperty("schools")List<School> schools,
								@JsonProperty("qualifications") List<String> qualifications) {}
}
