package com.bhanumat.client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage {
	WebDriver driver;
	WebDriverWait wait;

	@FindBy(id = "user_first_name")
	WebElement firstNameTextBox;

	@FindBy(id = "user_last_name")
	WebElement lastNameTextBox;

	@FindBy(id = "user_email")
	WebElement emailTextBox;

	@FindBy(id = "user_password")
	WebElement passwordTextBox;

	@FindBy(id = "user_password_confirmation")
	WebElement confirmPasswordText;

	@FindBy(name = "commit")
	WebElement signupButton;

	public SignupPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

		wait = new WebDriverWait(driver, 2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("user_first_name"))));
	}

	public void she_provides_the_first_name_as(String firstName) throws Throwable {
		firstNameTextBox.sendKeys(firstName);
	}

	public void she_provides_the_last_name_as(String lastName) throws Throwable {
		lastNameTextBox.sendKeys(lastName);
	}

	public void she_provides_the_email_as(String email) throws Throwable {
		emailTextBox.sendKeys(email);
	}

	public void she_provides_the_password_as(String password) throws Throwable {
		passwordTextBox.sendKeys(password);
	}

	public void she_provides_the_confirm_password_again_as(String confirmPassword) throws Throwable {
		confirmPasswordText.sendKeys(confirmPassword);
	}

	public void she_signs_up() throws Throwable {
		signupButton.click();
	}
}