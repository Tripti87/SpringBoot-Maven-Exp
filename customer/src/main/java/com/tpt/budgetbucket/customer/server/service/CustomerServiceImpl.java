package com.tpt.budgetbucket.customer.server.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpt.budgetbucket.customer.server.Repository.CustomerRepo;
import com.tpt.budgetbucket.customer.server.Repository.CustomerRepository;
import com.tpt.budgetbucket.customer.server.domain.Address;
import com.tpt.budgetbucket.customer.server.domain.Customer;

/**
 * Created by gupta on 23.06.2018.
 */

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Customer> getCustomerByName(String customerId){
		List<Customer> customers = new ArrayList<>();

		customers.add(getDummyCustomer());

		return customers;
	}

	private Customer getDummyCustomer() {
		Customer customer = new Customer();
		customer.setCustomerId("1");
		customer.setFirstName("Tripti");
		customer.setLastName("Gupta");
		customer.setEmail("gupta@gmail.com");
		customer.setPhone("123");
		customer.setStatus("Starter");

		Address address = new Address();
		address.setCountry("India");
		address.setCity("Delhi");
		customer.setAddress(address);

		return customer;
	}

	@Override
	public CustomerRepo getCustomerById(String customerId){
		if (customerId.equals("1") || customerId.equals("abc")){
			throw new NullPointerException();
		}
		//return getDummyCustomer();
		return customerRepository.getCustomer();
	}

	@Override
	public String postCustomer(Customer customer) {
		if (customer != null){
			return "Success";
		}
		return "fail";
	}
}
