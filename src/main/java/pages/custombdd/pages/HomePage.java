package pages.custombdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.cucumber.helper.UtilClass;

public class HomePage extends UtilClass {
	
	private WebDriver driver;
	private WebDriverWait wait;

	/*
	 *  WebElements for the Home Page
	 */

	@FindBy(linkText = "Register")
	private WebElement lnkUserRegister;

	public HomePage(WebDriver driver) {		
		this.driver = driver;
		wait = new WebDriverWait(driver, 20);
	    PageFactory.initElements(driver, this);
		wait.until(ExpectedConditions.titleContains("Live"));
	}
	
	/*
	 *  Click Register Link From Application Home Page
	 */

	public void clickRegisterLink() {
		
		clickElement(driver, lnkUserRegister);
	}

}
