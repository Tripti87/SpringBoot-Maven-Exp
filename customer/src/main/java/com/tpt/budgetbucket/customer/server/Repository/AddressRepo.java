package com.tpt.budgetbucket.customer.server.Repository;

import org.springframework.stereotype.Component;

/**
 * Created by gupta on 23.06.2018.
 */

@Component
public class AddressRepo {
	private String addressId;
	private String country;
	private String city;

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

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
