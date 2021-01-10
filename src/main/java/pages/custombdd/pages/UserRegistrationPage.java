package pages.custombdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.cucumber.helper.UtilClass;

public class UserRegistrationPage extends UtilClass{

	private WebDriver driver;
	private WebDriverWait wait;
	
	/*
	 * WebElement For UserRegistrationPage
	 */
	
	@FindBy(id = "profile_first_name")
	private WebElement txtFirstName;
	
	@FindBy(id = "profile_last_name")
	private WebElement txtLastName;
	
	@FindBy(id = "profile_gender_M")
	private WebElement btnGender;
	
	@FindBy(id = "profile_dob")
	private WebElement txtDOB;
	
	@FindBy(id = "profile_email")
	private WebElement txtEmail;
	
	@FindBy(id = "password")
	private WebElement txtPassword;
	
	@FindBy(id = "identity[password_confirmation]")
	private WebElement txtConfirmPassword;
	
	@FindBy(id = "chk_agree")
	private WebElement chkAgree;
	
	@FindBy(name = "commit")
	private WebElement btnSubmit;
	
	@FindBy(xpath = "//div[@class='error_signup']")
	private WebElement msg;
	
	public UserRegistrationPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 20);
	    PageFactory.initElements(driver, this);
		wait.until(ExpectedConditions.titleContains("user profile"));
	}
	
	/*
	 *   Methods for This Page
	 */
	
	public boolean verifyPageLoad() {
		boolean result = txtFirstName.isDisplayed();
		return result;
	}

	
	public void setFirstName(String firstName) {
		setText(driver, txtFirstName, firstName);
	}
	
	public void setLastName(String lastName) {
		
		setText(driver, txtLastName, lastName);
	}

}
