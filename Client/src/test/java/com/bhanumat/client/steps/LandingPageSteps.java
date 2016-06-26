package com.bhanumat.client.steps;

import com.bhanumat.client.LandingPage;

import cucumber.api.java.en.When;

public class LandingPageSteps extends DriverFactory {
	@When("^she chooses to sign up$")
	public void she_chooses_to_sign_up() throws Throwable {
		new LandingPage(driver).she_chooses_to_sign_up();
	}
}