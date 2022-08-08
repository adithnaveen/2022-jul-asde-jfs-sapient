package com.sapient.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart(); 

		Item item1 = new Item(101, 1000); 
		Item item2 = new Item(102, 456); 
		Item item3 = new Item(103, 78); 
		Item item4 = new Item(104, 100); 
		
		cart.addItem(item1); 
		cart.addItem(item2);
		cart.addItem(item3);
		
		log.info("Total is {}", cart.calculateTotal());
		cart.removeItem(item1);
		cart.addItem(item4);
		
		log.info("Total is {}", cart.calculateTotal());
		cart.pay(new UPIPaymentStrategy("7894561230"));

		cart.pay(new CreditCardStrategy("Kumar", "4567896532", 123));
	}
}
