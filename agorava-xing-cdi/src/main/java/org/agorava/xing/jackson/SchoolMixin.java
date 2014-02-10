package org.agorava.xing.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class SchoolMixin {

	@JsonCreator
	SchoolMixin(){}
	
	@JsonProperty("name")
	String name;
	
	@JsonProperty("degree")
	String degree;
	
	@JsonProperty("notes")
	String notes;
	
	@JsonProperty("subject")
	String subject;
	
	@JsonProperty("begin_date")
	String beginDate;
	
	@JsonProperty("end_date")
	String endDate;
}
