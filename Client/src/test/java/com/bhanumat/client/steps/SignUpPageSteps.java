package com.bhanumat.client.steps;

import com.bhanumat.client.SignupPage;

import cucumber.api.java.en.And;

public class SignUpPageSteps extends DriverFactory {
	@And("^she provides the first name as ([^\"]*)$")
	public void she_provides_the_first_name_as(String firstName) throws Throwable {
		new SignupPage(driver).she_provides_the_first_name_as(firstName);
	}

	@And("^she provides the last name as ([^\"]*)$")
	public void she_provides_the_last_name_as(String lastName) throws Throwable {
		new SignupPage(driver).she_provides_the_last_name_as(lastName);
	}

	@And("^she provides the email as ([^\"]*)$")
	public void she_provides_the_email_as(String email) throws Throwable {
		new SignupPage(driver).she_provides_the_email_as(email);
	}

	@And("^she provides the password as ([^\"]*)$")
	public void she_provides_the_password_as(String password) throws Throwable {
		new SignupPage(driver).she_provides_the_password_as(password);
	}

	@And("^she provides the confirm password again as ([^\"]*)$")
	public void she_provides_the_confirm_password_again_as(String confirmPassword) throws Throwable {
		new SignupPage(driver).she_provides_the_confirm_password_again_as(confirmPassword);
	}

	@And("^she signs-up$")
	public void she_signs_up() throws Throwable {
		new SignupPage(driver).she_signs_up();
	}
}