package com.sapient.junit5.test.cases;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Timeout;

import com.sapient.junit.works.ITestingSampleCode;
import com.sapient.junit.works.TestingSampleCode;

//4. order the execution of test cases 

@TestMethodOrder(OrderAnnotation.class)

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
	@Order(1)
	@DisplayName("test case to say hello to the user passed")
	void sayHelloTest() {
		assertEquals("hello " + validCaseName, tsc.helloName(validCaseName),
				"Sorry you did not say hello property to " + validCaseName);
	}

	@Order(2)
	@Test
	@DisplayName("to check if the name passed is more than 4 chars ")
	void checkNameTestPassNameMoreThanFourChars() {
		assertTrue(tsc.checkName(validCaseName));
	}

	// 1. if the data retrieved within 1000 ms then pass
	// 2. if the data retrieved over 1000ms then fail (thorws exception)
	// 3. group these cases

	@Test
	@Order(3)
	@DisplayName("To throw an exeption when the name length is lesser than 3 chars")
	void checkNameTestFailNameLessThanFourChars() {
		RuntimeException re = assertThrows(RuntimeException.class, () -> tsc.checkName(invalidCaseNames));

		assertEquals("Name Too Small", re.getMessage());
	}

	@Test
	@DisplayName("should pass the test when data retrieved with in 1000 ms ")
	void sholdPassCaseWhenRetrivedWithInStipulatedTime() {

		Integer namesSize = assertTimeout(Duration.ofMillis(1000), () -> {
			return tsc.getNames().size();
		});

		assertEquals(3, namesSize);
	}

	@Test
	@Timeout(unit = TimeUnit.MILLISECONDS, value = 1000)
	@DisplayName("should pass the test when data retrieved over 1000 ms")
	void sholdPassCaseWhenRetrivedWithOverStipulatedTime() {
		assertEquals(3, tsc.getNames().size());
	}

	@Test
	void groupedGetNamesTest() {
		assertAll("GetName",

				() -> {
					Integer namesSize = assertTimeout(Duration.ofMillis(3000), () -> {
						return tsc.getNames().size();
					});
					assertEquals(3, namesSize);
				}, 
				() -> assertEquals(3, tsc.getNames().size()));
	}

	@Test
	@DisplayName("Check number of names retrieved is equal to 3")
	void getNameTest() {
		assertEquals(3, tsc.getNames().size());
	}

	
	
	
	@Nested
	@DisplayName("Demonstration on Nested testtcases ")
	class NestdedDemo {
		@Test
		@DisplayName("Check number of names retrieved is equal to 3")
		void getNameTest() {
			assertEquals(3, tsc.getNames().size());
		}

		@Test
		@Timeout(unit = TimeUnit.MILLISECONDS, value = 2500)
		@DisplayName("should pass the test when data retrieved over 1000 ms")
		void sholdPassCaseWhenRetrivedWithOverStipulatedTime() {
			assertEquals(3, tsc.getNames().size());
		}
	}
	
	
	
	
	
	
	
	
	
}
