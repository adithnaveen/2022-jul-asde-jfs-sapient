package com.sapient.junit.works;

import java.util.List;

public class TestingSampleCode {
	public String helloName(String name) {
		return "hello " + name; 
	}
	
	public List<String> getNames () {
		return List.of("Alok", "Nielless", "Rohan"); 
	}
	
	public boolean checkName(String name) {
		if(name.length() < 4) {
			throw new RuntimeException("Name Too Small"); 
		}
		
		return true; 
	}
}
