package com.bhanumat.client.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bhanumat.client.HomePage;
import com.bhanumat.client.LandingPage;
import com.bhanumat.client.SignupPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClientSteps {
	// static {
	// File file = new
	// File("E:\\workspaces\\mar\\fizz-buzz\\src\\test\\drivers\\IEDriverServer.exe");
	// System.setProperty("webdriver.ie.driver", file.getAbsolutePath());

	// }

	WebDriver driver = new FirefoxDriver();

	@Given("^the user is on landing page$")
	public void setup() throws Throwable {
		driver.get("http://accountsdemo.herokuapp.com");
		driver.manage().window().maximize();
	}

	@When("^she chooses to sign up$")
	public void she_chooses_to_sign_up() throws Throwable {
		// driver.findElement(By.linkText("Sign up")).click();
		new LandingPage(driver).she_chooses_to_sign_up();
	}

	@And("^she provides the first name as ([^\"]*)$")
	public void she_provides_the_first_name_as(String firstName) throws Throwable {
		// WebDriverWait wait = new WebDriverWait(driver, 4000);
		// wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("user_first_name"))));
		// driver.findElement(By.id("user_first_name")).sendKeys(firstName);
		new SignupPage(driver).she_provides_the_first_name_as(firstName);

	}

	@And("^she provides the last name as ([^\"]*)$")
	public void she_provides_the_last_name_as(String lastName) throws Throwable {
		// driver.findElement(By.id("user_last_name")).sendKeys(lastName);
		new SignupPage(driver).she_provides_the_last_name_as(lastName);
	}

	@And("^she provides the email as ([^\"]*)$")
	public void she_provides_the_email_as(String email) throws Throwable {
		// driver.findElement(By.id("user_email")).sendKeys(email);
		new SignupPage(driver).she_provides_the_email_as(email);
	}

	@And("^she provides the password as ([^\"]*)$")
	public void she_provides_the_password_as(String password) throws Throwable {
		// driver.findElement(By.id("user_password")).sendKeys(password);
		new SignupPage(driver).she_provides_the_password_as(password);
	}

	@And("^she provides the confirm password again as ([^\"]*)$")
	public void she_provides_the_confirm_password_again_as(String confirmPassword) throws Throwable {
		// driver.findElement(By.id("user_password_confirmation")).sendKeys(confirmPassword);
		new SignupPage(driver).she_provides_the_confirm_password_again_as(confirmPassword);
	}

	@And("^she signs-up$")
	public void she_signs_up() throws Throwable {
		// driver.findElement(By.name("commit")).click();
		new SignupPage(driver).she_signs_up();
	}

	@Then("^she should be logged in to the application$")
	public void she_should_be_logged_in_to_the_application() throws Throwable {
		// boolean signOutLinkDisplayed =
		// driver.findElement(By.cssSelector("a[href='/users/sign_out']")).isDisplayed();
		// Assert.assertTrue(signOutLinkDisplayed);
		Assert.assertTrue(new HomePage(driver).isSignOutLinkDisplayed());
	}
}
