package com.bhanumat.client;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	@FindBy(css = "a[href='/users/sign_out']")
	WebElement signout;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public boolean isSignOutLinkDisplayed() throws Throwable {
		return signout.isDisplayed();
	}
}