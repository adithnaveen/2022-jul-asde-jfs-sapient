package com.sapient.junit5.test.cases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.sapient.junit.works.ITestingSampleCode;
import com.sapient.junit.works.TestingSampleCode;
 
//4. order the execution of test cases 


class TestingSampleCodeTest {
	
	private ITestingSampleCode tsc; 
	private String validCaseName = "Siddharth";
	private String invalidCaseNames = "Ali"; 
	@BeforeEach
	public void setUp() {
		tsc = new TestingSampleCode(); 
	}
	@AfterEach
	public void tearDown() {
		
	}
	
	@Test
	@DisplayName("test case to say hello to the user passed")
	void sayHelloTest() {
	 	assertEquals("hello " + validCaseName, tsc.helloName(validCaseName) ,
			"Sorry you did not say hello property to " + validCaseName);
	}

	@Test
	@DisplayName("to check if the name passed is more than 4 chars ")
	void checkNameTestPassNameMoreThanFourChars() {
		assertTrue(tsc.checkName(validCaseName));
	}

	// 1. if the data retrieved within 1000 ms then pass 
	// 2. if the data retrieved over 100ms then fail (thorws exception) 
	// 3. group these cases
	
	@Test
	@DisplayName("To throw an exeption when the name length is lesser than 3 chars")
	void checkNameTestFailNameLessThanFourChars() {
	 		RuntimeException re = assertThrows(RuntimeException.class,
				() -> tsc.checkName(invalidCaseNames)); 
		
		assertEquals("Name Too Small", re.getMessage());
	} 
	
	@Test
	@DisplayName("Check number of names retrieved is equal to 3")
	void getNameTest() {
		assertEquals(3, tsc.getNames().size());
	}
	
}












