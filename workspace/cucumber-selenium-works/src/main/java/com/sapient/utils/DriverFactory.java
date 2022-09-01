package com.sapient.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	private static WebDriver driver= null; 
	
	public static WebDriver getDrvier(DriverNames driverName) {
		if(driverName.equals(DriverNames.CHROME)) {
			System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH);
			// if you have other capabialities 
			// like headless browser 
			// make incognito... 
			driver = new ChromeDriver();
		}else if(driverName.equals(DriverNames.FIREFOX)) {
			// return fire fox driver 
		}
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver; 
	}
}
