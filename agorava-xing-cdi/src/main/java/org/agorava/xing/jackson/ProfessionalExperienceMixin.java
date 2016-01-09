package org.agorava.xing.jackson;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
	
//	@JsonProperty("awards")
//	List<Award> awards;
}
