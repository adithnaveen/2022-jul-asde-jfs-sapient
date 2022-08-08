package com.sapient.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Item> items; 
	
	public ShoppingCart() {
		this.items = new ArrayList<>(); 
	}
	
	public void addItem(Item item) {
		this.items.add(item); 
	}
	
	public void removeItem(Item item) {
		this.items.remove(item); 
	}
	
	public double calculateTotal() {
		double sum = 0; 
		for(Item i : this.items) {
			sum += i.getItemPrice(); 
		}
		return sum;
	}
	
	public void pay(PaymentStrategy ps) {
		ps.pay((int) calculateTotal());
	}
	
}
