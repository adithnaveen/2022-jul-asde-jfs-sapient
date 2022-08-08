package com.sapient.singleton;

public class EagerSingleTonEx {
	private static final EagerSingleTonEx instance = new EagerSingleTonEx(); 
	
	
	// the object creation is not accessable by any body outside the class 
	private EagerSingleTonEx() {
		System.out.println("Object Created... ");
	}
	
	public static EagerSingleTonEx getInstance() {
		return instance;
	}
}
