package org.agorava.xing.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

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
