package com.sapient.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CreditCardStrategy implements PaymentStrategy {

	private String name;
	private String cardNo;
	private int cvv;
	
	public CreditCardStrategy(String name, String cardNo, int cvv) {
		this.name = name; 
		this.cardNo = cardNo; 
		this.cvv = cvv; 
	}
	
	@Override
	public void pay(int amount) {
		log.info("Paying with Credit Card Amount : {}", amount);
	}

}
