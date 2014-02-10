package org.agorava.xing.model;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class Location implements Serializable {

	private static final long serialVersionUID = -5410441225782013121L;

	private Location geoCode;
	private String city;
	private String country;
	private String street;
	private String zipcode;
	private String region;

	public Location(String city, String country, String street, String zipcode, String region) {
		this.city = city;
		this.country = country;
		this.street = street;
		this.zipcode = zipcode;
		this.region = region;
	}

	public Location getGeoCode() {
		return geoCode;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public String getStreet() {
		return street;
	}

	public String getZipcode() {
		return zipcode;
	}

	public String getRegion() {
		return region;
	}
}
