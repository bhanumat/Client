package com.bhanumat.client;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {

	WebDriver driver;
	WebDriverWait wait;

	@FindBy(linkText = "Sign up")
	WebElement signup;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void she_chooses_to_sign_up() throws Throwable {
		signup.click();
	}
}
