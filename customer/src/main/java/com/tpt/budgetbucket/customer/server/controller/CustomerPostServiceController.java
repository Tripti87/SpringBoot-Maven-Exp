package com.tpt.budgetbucket.customer.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tpt.budgetbucket.customer.server.domain.Customer;
import com.tpt.budgetbucket.customer.server.service.CustomerService;
import com.tpt.budgetbucket.customer.server.util.ServerEndPoint;

@RestController
public class CustomerPostServiceController {

	@Autowired
	CustomerService customerService;

	@RequestMapping(value = ServerEndPoint.V1_CUSTOMER_Add, method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> postCustomerData(@RequestBody Customer customer){

		String postCustomer = customerService.postCustomer(customer);

		return new ResponseEntity(postCustomer, HttpStatus.OK);
	}
}
