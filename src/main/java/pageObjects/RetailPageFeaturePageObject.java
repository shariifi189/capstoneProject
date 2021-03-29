package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class RetailPageFeaturePageObject extends Base {
	
	public RetailPageFeaturePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath ="//span[contains(text(),'My Account')]")
	private WebElement myAccount;
	
	@FindBy(xpath ="//a[contains(text(),'Login')]")
	private WebElement loging;
	
	@FindBy(xpath ="//input[@id='input-email']")
	private WebElement emailField;
	
	@FindBy (xpath ="//input[@id='input-password']")
	private WebElement passwordField;
	
	@FindBy (xpath ="//input[@class='btn btn-primary']")
	private WebElement logingButton;
	
//	@FindBy (xpath ="")
//	private WebElement   ;
	
	public void clickOnMyAccount() {
		WebDriverUtility.clickOnElement(myAccount);
	}
	
	public void clickOnLogin() {
		WebDriverUtility.clickOnElement(loging);
	}
	
	public void enterEmail(String value) {
		WebDriverUtility.enterValue(emailField, value);
	}
	
	public void enterPassword(String value) {
		WebDriverUtility.enterValue(passwordField, value);
	}
	
	public void clickOnLoginButton() {
		WebDriverUtility.clickOnElement(logingButton);
	}
	
//	public boolean userShouldSeeDashboard() {
//		if()
//			return true;
//		else
//			return false;
//		
//	}

	
	
	
	
}
