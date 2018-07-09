package com.tpt.budgetbucket.expense.server.service;

import com.tpt.budgetbucket.expense.dtos.Item;

public interface ExpenseService {

	Item getItemById(String itemId);
}
