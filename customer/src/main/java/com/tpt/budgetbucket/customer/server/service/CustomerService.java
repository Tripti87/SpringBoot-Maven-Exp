package com.tpt.budgetbucket.customer.server.service;

import java.util.List;

import com.tpt.budgetbucket.customer.server.Repository.CustomerRepo;
import com.tpt.budgetbucket.customer.server.domain.Customer;

/**
 * Created by gupta on 01.07.2018.
 */
public interface CustomerService {
	CustomerRepo getCustomerById(String customerId);
	List<Customer> getCustomerByName(String customerName);
	String postCustomer(Customer customer);
}
