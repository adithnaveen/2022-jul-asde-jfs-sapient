package com.sapient.junit.works;

import java.util.List;

/**
 * 
 * @author naveenkumar
 *
 */
public class TestingSampleCode implements ITestingSampleCode {
	
	/**
	 * @see saying hello to the user when passed as argument 
	 * @return string 
	 */
	
	@Override
	public String helloName(String name) {
		return "hello " + name; 
	}
	
	@Override
	public List<String> getNames ()  {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			 Thread.currentThread().interrupt();
		}
		return List.of("Alok", "Nielless", "Rohan"); 
	}
	
	@Override
	public boolean checkName(String name) {
		if(name.length() < 4) {
			throw new CustomRuntimeException("Name Too Small"); 
		}
		
		return true; 
	}
}
