package com.bhanumat.client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {

	WebDriver driver;
	WebDriverWait wait;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public void she_chooses_to_sign_up() throws Throwable {
		driver.findElement(By.linkText("Sign up")).click();
	}
}
