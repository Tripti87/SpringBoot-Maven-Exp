package com.tpt.budgetbucket.customer.server.service;

import java.util.List;

import com.tpt.budgetbucket.customer.server.domain.Customer;

/**
 * Created by gupta on 01.07.2018.
 */
public interface CustomerService {
	List<Customer> getCustomerById(String customerId);
}
