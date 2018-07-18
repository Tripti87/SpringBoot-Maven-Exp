package com.tpt.budgetbucket.customer.server.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tpt.budgetbucket.customer.server.Repository.CustomerRepo;
import com.tpt.budgetbucket.customer.server.domain.Customer;
import com.tpt.budgetbucket.customer.server.exception.CustomerNotFoundException;
import com.tpt.budgetbucket.customer.server.service.CustomerService;
import com.tpt.budgetbucket.customer.server.util.ServerEndPoint;

@RestController
public class CustomerGetServiceController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerGetServiceController.class);

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = ServerEndPoint.V1_CUSTOMER_BY_ID, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomerRepo> getCustomerById(@RequestParam("id") String customerId){
		LOGGER.info(ServerEndPoint.V1_CUSTOMER_BY_ID + "Request with id: " + customerId);
		// Handle any exception
		if (customerId.isEmpty()){
			throw new CustomerNotFoundException();
		}
		CustomerRepo customerById = customerService
				.getCustomerById(customerId);

		return new ResponseEntity<>(customerById, HttpStatus.OK);
	}

	@RequestMapping(value = ServerEndPoint.V1_CUSTOMER_BY_NAME, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Customer>> getCustomersByName(@PathVariable("name") String name){
		List<Customer> customerList = customerService.getCustomerByName(name);

		return new ResponseEntity<>(customerList, HttpStatus.OK);
	}

	@RequestMapping(value = ServerEndPoint.V1_CUSTOMER, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomerRepo> getCustomerByParams(@RequestParam("name") String name, @RequestParam("email") String email){
		CustomerRepo customer = customerService.getCustomerById(name);

		return new ResponseEntity<>(customer, HttpStatus.OK);
	}

	// Handle a specific Java Runtime Exception class for the controller
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> handleExceptionInController(){
		return new ResponseEntity<>("Id is Null" , HttpStatus.NOT_FOUND);
	}

}
