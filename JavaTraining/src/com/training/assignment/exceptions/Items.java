package com.training.assignment.exceptions;

public class Items {

	int itemId;
	String name;
	int price;
	
	public Items(int itemId, String name, int price) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
