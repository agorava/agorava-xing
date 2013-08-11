package org.agorava.xing.jackson;

import java.util.List;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.BirthDate;
import org.agorava.xing.model.BusinessAddress;
import org.agorava.xing.model.EducationalBackground;
import org.agorava.xing.model.PhotoUrls;
import org.agorava.xing.model.PrivateAddress;
import org.agorava.xing.model.ProfessionalExperience;
import org.agorava.xing.model.TimeZone;
import org.agorava.xing.model.User.InstantMessagingAccount;
import org.agorava.xing.model.User.Language;
import org.agorava.xing.model.User.LanguageLevel;
import org.agorava.xing.model.User.PremiumService;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class UserMixin {

	@JsonCreator
	UserMixin(@JsonProperty("id") String id) {
	}

	@JsonProperty("first_name")
	String firstName;

	@JsonProperty("last_name")
	String lastName;

	@JsonProperty("display_name")
	String displayName;

	@JsonProperty("page_name")
	String pageName;

	@JsonProperty("permalink")
	String permalink;

	@JsonProperty("gender")
	String gender;

	@JsonProperty("birth_date")
	BirthDate birthDate;

	@JsonProperty("active_email")
	String activeEmail;

	@JsonProperty("time_zone")
	TimeZone timeZone;

	@JsonProperty("premium_services")
	List<PremiumService> premiumServices;

	@JsonProperty("badges")
	List<String> badges;

	@JsonProperty("wants")
	String wants;

	@JsonProperty("haves")
	String haves;

	@JsonProperty("interests")
	String interests;

	@JsonProperty("organisations_member")
	String organisationMember;

	@JsonProperty("languages")
	Map<Language, LanguageLevel> languages;

	@JsonProperty("private_address")
	PrivateAddress privateAddress;

	@JsonProperty("businness_address")
	BusinessAddress BusinessAddress;

	@JsonProperty("web_profiles")
	Map<String, List<String>> webProfiles;

	@JsonProperty("instant_messaging_account")
	Map<InstantMessagingAccount, String> instantMessagingAccount;

	@JsonProperty("professional_experience")
	ProfessionalExperience professionalExperience;

	@JsonProperty("educational_background")
	EducationalBackground educationalBackground;

	@JsonProperty("photo_urls")
	PhotoUrls photoUrls;
}
