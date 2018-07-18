package com.tpt.budgetbucket.customer.server.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.tpt.budgetbucket.customer.server.domain.ExceptionMsg;

@ControllerAdvice
public class GlobalControllerExceptionHandler {

	@Autowired
	ExceptionMsg exceptionMsg;

	// Handle a specific Java Runtime Exception class for all controllers
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<ExceptionMsg> handleException(Exception e){
		exceptionMsg.setMsg("Problem encounterd in handling the request");
		exceptionMsg.setStatus(HttpStatus.BAD_REQUEST.name());

		return new ResponseEntity<ExceptionMsg>(exceptionMsg, HttpStatus.BAD_REQUEST);
	}

}


