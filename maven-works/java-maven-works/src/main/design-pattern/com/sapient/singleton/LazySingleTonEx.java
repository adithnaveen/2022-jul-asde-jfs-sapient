package com.sapient.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LazySingleTonEx {

	private LazySingleTonEx() {
		log.info("Lazy Singleton Created...");
	}
	
	public static LazySingleTonEx getInstance(LazySingleTonEx instance) {
		
		return instance == null ? new LazySingleTonEx() : instance; 
		
		
	}
	
}
