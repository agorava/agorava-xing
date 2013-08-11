package org.agorava.xing.jackson;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class PrivateAddressMixin {

	@JsonCreator
	PrivateAddressMixin() {
	}

	@JsonProperty("city")
	String city;

	@JsonProperty("country")
	String country;

	@JsonProperty("zip_code")
	String zipCode;

	@JsonProperty("street")
	String street;

	@JsonProperty("phone")
	String phone;

	@JsonProperty("fax")
	String fax;

	@JsonProperty("province")
	String province;

	@JsonProperty("email")
	String email;

	@JsonProperty("mobile_phone")
	String mobilePhone;
}
