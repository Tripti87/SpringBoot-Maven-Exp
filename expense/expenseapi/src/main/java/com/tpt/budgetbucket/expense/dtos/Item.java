package com.tpt.budgetbucket.expense.dtos;

import org.springframework.stereotype.Component;


@Component
public class Item {
	private String itemId;
	private String itemName;
	private ItemType itemType;
	private Double cost;
	private int frequecy;

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public int getFrequecy() {
		return frequecy;
	}

	public void setFrequecy(int frequecy) {
		this.frequecy = frequecy;
	}
}
