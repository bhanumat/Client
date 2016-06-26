package com.bhanumat.client.steps;

import org.junit.Assert;

import com.bhanumat.client.HomePage;

import cucumber.api.java.en.Then;

public class HomePageSteps extends DriverFactory {
	@Then("^she should be logged in to the application$")
	public void she_should_be_logged_in_to_the_application() throws Throwable {
		Assert.assertTrue(new HomePage(driver).isSignOutLinkDisplayed());
	}
}