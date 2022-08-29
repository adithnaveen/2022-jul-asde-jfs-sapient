package com.sapient.react.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sapient.pom.ContactPOM;
import com.sapient.utils.DriverFactory;
import com.sapient.utils.DriverNames;
import com.sapient.utils.Util;

class ReactApplicationTest {

	private WebDriver driver;
	private String url;
	private ContactPOM cpom; 
	
	@BeforeEach
	public void setUp() {
		driver = DriverFactory.getDrvier(DriverNames.CHROME);
		url = "http://localhost:3000/";
		cpom = new ContactPOM(driver); 
	}

	@Test
	@Disabled
	@DisplayName("to register user with valid details")
	void registerUserTest() {
		driver.get(url);

		String nameXpath = "//*[@id=\"root\"]/div/div/div[1]/div/form/div[1]/div/input"; 
		driver.findElement(By.xpath(nameXpath)).clear();
		driver.findElement(By.xpath(nameXpath)).sendKeys("NaveenKumar");
		
		Util.sleepMillis(1000);
		driver.findElement(By.name("email")).clear(); 
		driver.findElement(By.name("email")).sendKeys("naveenkumar@naveen.com");
		Util.sleepMillis(1000);

		driver.findElement(By.name("phone")).sendKeys("9898989898");
		driver.findElement(By.name("picture")).sendKeys("/naveenpic");
		Util.sleepMillis(1000);
		driver.findElement(By.id("submitBtn")).click();
		 
	}
	@Test
	@DisplayName("to register user with valid details")
	void registerUserTest1() {
		driver.get(url);
		cpom.sendName("Alok Anand");
		cpom.sendEmail("alok@gmail.com");
		cpom.sendPhone("3232323232");
		cpom.clickAddToList();
	}
	
	

	@AfterEach
	public void tearDown() {
		Util.sleepMillis(1000);
		driver.close(); 
	}
	
}
