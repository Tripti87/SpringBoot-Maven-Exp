package com.tpt.budgetbucket.expense.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tpt.budgetbucket.expense.dtos.Item;
import com.tpt.budgetbucket.expense.server.service.ExpenseService;
import com.tpt.budgetbucket.expense.util.ExpenseServiceEndPoint;

@RestController
public class ExpenseGetServiceController {

	@Autowired
	ExpenseService expenseService;

	@RequestMapping(value = ExpenseServiceEndPoint.V1_EXPENSE_BY_ID, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Item> getItemById(@RequestParam("id") String itemId){

		Item item = expenseService.getItemById(itemId);

		return new ResponseEntity(item, HttpStatus.OK);
	}
}
