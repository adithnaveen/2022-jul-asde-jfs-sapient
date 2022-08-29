package com.sapient.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPOM {
	private WebDriver driver; 
	
	public ContactPOM(WebDriver driver) {
		this.driver = driver; 
	}
	
	
	public void sendName(String name) {
		clear("name");
		driver.findElement(By.name("name")).sendKeys(name);
	}

	
	public void sendEmail(String email) {
		clear("email"); 
		driver.findElement(By.name("email")).sendKeys(email);
	}
	
	public void sendPhone(String phone) {
		clear("phone");
		driver.findElement(By.name("phone")).sendKeys(phone);
	}
	
	public void clickAddToList() {
		driver.findElement(By.id("submitBtn")).click();
	}

	private void clear(String name) {
		driver.findElement(By.name(name)).clear();
	}
	
	
}
