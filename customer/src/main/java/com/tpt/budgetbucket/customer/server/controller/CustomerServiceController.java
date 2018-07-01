package com.tpt.budgetbucket.customer.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tpt.budgetbucket.customer.server.domain.Customer;
import com.tpt.budgetbucket.customer.server.service.CustomerService;
import com.tpt.budgetbucket.customer.server.util.ServerEndPoint;

@RestController
public class CustomerServiceController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = ServerEndPoint.V1_CUSTOMER_BY_ID, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Customer>> getCustomerById(@RequestParam("CustomerId") String customerId){

		List<Customer> customerByIdList = customerService
				.getCustomerById(customerId);

		return new ResponseEntity<>(customerByIdList, HttpStatus.OK);

	}

}
