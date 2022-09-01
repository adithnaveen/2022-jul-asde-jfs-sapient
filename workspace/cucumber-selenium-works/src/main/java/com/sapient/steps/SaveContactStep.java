package com.sapient.steps;

import org.openqa.selenium.WebDriver;

import com.sapient.pom.ContactPOM;
import com.sapient.utils.DriverFactory;
import com.sapient.utils.DriverNames;
import com.sapient.utils.Util;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SaveContactStep {

	private ContactPOM cpom; 
	private WebDriver driver; 

	public SaveContactStep() {
		
	}
	 
	

	@Given("the application is running on {string}")
	public void the_application_is_running_on(String string) {
		if(string.equals("chrome")) {
			this.driver = DriverFactory.getDrvier(DriverNames.CHROME);
			cpom = new ContactPOM(driver);
			
			driver.get("http://localhost:3000/");
		}
	}


	@When("the user name {string}")
	public void the_user_name(String string) {
		System.out.println("user name to be sent is :::: " + string);
		Util.sleepMillis(1000);
		cpom.sendName(string);
	}

	@When("email address as {string}")
	public void email_address_as(String string) {
		 cpom.sendEmail(string);
	}

	@When("Phone Number as {string}")
	public void phone_number_as(String string) {
		cpom.sendPhone(string);
	}

	@When("picture as {string}")
	public void picture_as(String string) {
		System.out.println("picture will be sent ");
	}

	@When("clicked on submit")
	public void clicked_on_submit() {
		cpom.clickAddToList();
	}

	@Then("alert message to be shown")
	public void alert_message_to_be_shown() {
		driver.switchTo().alert().accept();
		driver.close();
	}

}
