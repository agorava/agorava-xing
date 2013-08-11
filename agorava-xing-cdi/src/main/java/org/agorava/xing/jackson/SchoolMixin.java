package org.agorava.xing.jackson;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

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
