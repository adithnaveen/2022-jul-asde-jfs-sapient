package com.sapient.e2e.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestEx01 {
	public static void main(String[] args) {
		
		WebDriver driver = null; 
		// 1. locate the driver + path
		String path = "/Volumes/Kanchan/MyTrainings/sapient/2022-jul-asde-jfs-sapient/driver/chromedriver"; 
		String key = "webdriver.chrome.driver"; 
		System.setProperty(key, path); 
				
		// 2. load the driver 
		driver = new ChromeDriver();
		
		// 3. processing
		String url = "https://www.google.com/";
		// get will open the browser 
		driver.get(url);
		String title = driver.getTitle();
		System.out.println("Google Title : " + title);
		
		// 4. close
		driver.close();
	}
}
