package org.agorava.xing.jackson;

import java.util.List;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.Award;
import org.agorava.xing.model.Company;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ProfessionalExperienceMixin {

	@JsonCreator
	ProfessionalExperienceMixin(){}
	
	@JsonProperty("primary_company")
	Company primaryCompany;
	
	@JsonProperty("non_primary_companies")
	List<Company> nonPrimaryCompanies;
	
	@JsonProperty("awards")
	List<Award> awards;
}
