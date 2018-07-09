package com.tpt.budgetbucket.expense.server.service;

import org.springframework.stereotype.Service;

import com.tpt.budgetbucket.expense.dtos.Item;
import com.tpt.budgetbucket.expense.dtos.ItemType;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Override
	public Item getItemById(String itemId) {
		return getDummyItem();
	}

	private Item getDummyItem() {
		Item item = new Item();

		item.setItemId("1");
		item.setItemName("Item1");
		item.setCost(140.00);
		item.setFrequecy(1);
		item.setItemType(ItemType.RENT);

		return item;
	}
}
