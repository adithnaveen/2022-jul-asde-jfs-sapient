package com.sapient.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TrainerRegistrationSteps {

	@Given("the application is running")
	public void the_application_is_running() {
		System.out.println("<<<<< the application is running");
	}

	@When("user is valid")
	public void user_is_valid() {
		System.out.println("<<<<<< user is valid");
	}

	@Then("register the user")
	public void register_the_user() {
		System.out.println("<<<<< register the user");
	}

}
