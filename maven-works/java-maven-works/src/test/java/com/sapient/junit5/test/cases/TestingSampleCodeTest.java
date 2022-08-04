package com.sapient.junit5.test.cases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sapient.junit.works.TestingSampleCode;
 

class TestingSampleCodeTest {

	@Test
	void helloNameTest() {
		TestingSampleCode tsc = new TestingSampleCode(); 
		String name = "Asif"; 
		String returnName = tsc.helloName(name);
		
		assertEquals("hello " + name, returnName);
	}

}
