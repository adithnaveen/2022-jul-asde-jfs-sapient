package com.sapient.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TrainingLoginStep {

	@Given("^the application is loaded$")
	public void the_application_is_loaded() {
		System.out.println("the application is loaded >>>>");
	}

	@When("the user enters username as {string}")
	public void the_user_enters_username(String name) {
		System.out.println("the user enters username as "+name+" >>>>>");
	}

	@And("password as {string}")
	public void password_as_secret(String password) {
		System.out.println("password as "+password+">>>>>");
	}

	@Then("validate the user")
	public void validate_the_user() {
		System.out.println("validate the user>>>>");
	}

	@Then("show homescreen")
	public void show_homescreen() {
		System.out.println("show homescreen>>>>");
	}

}
