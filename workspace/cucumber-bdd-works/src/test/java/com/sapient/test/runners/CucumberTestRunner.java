package com.sapient.test.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/resources"}, 
		glue = {"com.sapient.steps"}, 
		monochrome = true, 
		publish = false, 
		plugin = {"pretty", "json:target/api-report.json", "html:target/html-reports.html"}, 
		tags = "@regression"
	)
public class CucumberTestRunner {

	// this has to be treated as cucumber runner 
	// no business logic 
	// here junit is only a test framework to connect 
	// actual logic with step defn 
}
