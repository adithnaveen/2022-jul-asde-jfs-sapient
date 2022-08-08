package com.sapient.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UPIPaymentStrategy implements PaymentStrategy{

	private String mobileNumber; 
	
	public UPIPaymentStrategy(String mobileNumber) {
		this.mobileNumber = mobileNumber; 
	}
	
	@Override
	public void pay(int amount) {
		log.info("payment with UPI {}", amount);
	}

}
