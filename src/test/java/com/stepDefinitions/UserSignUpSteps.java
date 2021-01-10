package com.stepDefinitions;

import pages.custombdd.pages.WebDriverManager;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.custombdd.pages.HomePage;
import pages.custombdd.pages.UserRegistrationPage;

public class UserSignUpSteps {

	public WebDriver driver = getDriver();
	public HomePage homePage;
	public UserRegistrationPage userRegistrationPage;

	public WebDriver getDriver() {
		return WebDriverManager.driver;
	}
	
	@Given("I Select Chrome Browser To Launch {string} For Test Execution")
	public void i_login_to_application_with_in_browser(String url) throws Throwable {
		driver.get(url);
		homePage = new HomePage(driver);
	}
	
	@When("I Click On Register Link in Home Page")
	public void i_ClickOn_UserRegister_Link() throws Throwable {
		homePage.clickRegisterLink();
	}
	
	@Then("I Verify New User Account Page Loaded Successfully")
	public void verify_UserAccountPageLoad() throws Throwable {
		userRegistrationPage = new UserRegistrationPage(driver);
		boolean result = userRegistrationPage.verifyPageLoad();
		Assert.assertTrue("Element is Not Displayed", result);
	}
	
	@When("I Set Text {string} in First Name Field; in Account Sign Up Page")
	public void SetTextInFirstNameField(String firstName) throws Throwable {
		userRegistrationPage = new UserRegistrationPage(driver);
		userRegistrationPage.setFirstName(firstName);
	}
	
	@And("I Set Text {string} in Last Name Field; in Account Sign Up Page")
	public void SetTextInLastNameField(String lastName) throws Throwable {
		userRegistrationPage = new UserRegistrationPage(driver);
		userRegistrationPage.setLastName(lastName);
	}

}