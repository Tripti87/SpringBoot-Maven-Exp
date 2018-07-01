package com.tpt.budgetbucket.customer.server.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpt.budgetbucket.customer.server.domain.Address;
import com.tpt.budgetbucket.customer.server.domain.Customer;

/**
 * Created by gupta on 23.06.2018.
 */

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private Customer customer;

	@Autowired
	private Address address;

	@Override
	public List<Customer> getCustomerById(String customerId){
		List<Customer> customers = new ArrayList<>();

		customer.setCustomerId("1");
		customer.setFirstName("Tripti");
		customer.setLastName("Gupta");
		customer.setEmail("gupta@gmail.com");
		customer.setPhone("123");
		customer.setStatus("Starter");
		address.setCountry("India");
		address.setCity("Delhi");
		customer.setAddress(address);

		customers.add(customer);

		return customers;
	}
}
