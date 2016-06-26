package com.bhanumat.client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage {
	WebDriver driver;
	WebDriverWait wait;

	public SignupPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("user_first_name"))));
	}

	public void she_provides_the_first_name_as(String firstName) throws Throwable {
		driver.findElement(By.id("user_first_name")).sendKeys(firstName);
	}

	public void she_provides_the_last_name_as(String lastName) throws Throwable {
		driver.findElement(By.id("user_last_name")).sendKeys(lastName);
	}

	public void she_provides_the_email_as(String email) throws Throwable {
		driver.findElement(By.id("user_email")).sendKeys(email);
	}

	public void she_provides_the_password_as(String password) throws Throwable {
		driver.findElement(By.id("user_password")).sendKeys(password);
	}

	public void she_provides_the_confirm_password_again_as(String confirmPassword) throws Throwable {
		driver.findElement(By.id("user_password_confirmation")).sendKeys(confirmPassword);
	}

	public void she_signs_up() throws Throwable {
		driver.findElement(By.name("commit")).click();
	}
}