package com.bhanumat.client.steps;

import cucumber.api.java.en.Given;

public class StartingSteps extends DriverFactory {

	@Given("^the user is on landing page$")
	public void setup() throws Throwable {
		driver.get("http://accountsdemo.herokuapp.com");
		driver.manage().window().maximize();
	}
}
