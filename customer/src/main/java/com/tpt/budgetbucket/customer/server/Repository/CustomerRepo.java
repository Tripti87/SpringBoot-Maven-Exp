package com.tpt.budgetbucket.customer.server.Repository;

import org.springframework.stereotype.Component;


@Component
public class CustomerRepo {
	private String customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String addressRepoId;
	private String status;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddressRepoId() {
		return addressRepoId;
	}

	public void setAddressRepoId(String addressRepoId) {
		this.addressRepoId = addressRepoId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
