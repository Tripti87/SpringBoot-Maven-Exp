package com.tpt.budgetbucket.customer.server.domain;

import org.springframework.stereotype.Component;

/**
 * Created by gupta on 23.06.2018.
 */

@Component
public class Address {
	private String country;
	private String city;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
