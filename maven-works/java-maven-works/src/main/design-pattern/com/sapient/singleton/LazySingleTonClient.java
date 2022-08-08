package com.sapient.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LazySingleTonClient {
	public static void main(String[] args) {
		LazySingleTonEx instance = null; 
		

		instance = LazySingleTonEx.getInstance(instance); 
		log.info("Instance @ {}", instance.hashCode());

		instance = LazySingleTonEx.getInstance(instance); 
		log.info("Instance @ {}", instance.hashCode());

		instance = LazySingleTonEx.getInstance(instance); 
		log.info("Instance @ {}", instance.hashCode());
	}
}
