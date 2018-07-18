package com.tpt.budgetbucket.customer.server.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//To handle a specific status
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CustomerNotFoundException extends RuntimeException{

	//Customized exception for a status
	public CustomerNotFoundException(){

	}

}