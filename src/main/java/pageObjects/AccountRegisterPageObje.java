package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class AccountRegisterPageObje extends Base{
	
	public AccountRegisterPageObje() {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath ="//span[contains(text(),'My Account')]")
	private WebElement myAccount;
	
	@FindBy(xpath ="(//a[text()='Register'])[1]")
	private WebElement register;
	
	@FindBy(xpath ="//input[@id='input-firstname']")
	private WebElement firstNameField;
	
	@FindBy(xpath ="//input[@id='input-lastname']")
	private WebElement lastNameField;
	
	@FindBy(xpath ="//input[@id='input-email']")
	private WebElement emailField;
	
	@FindBy(xpath ="//input[@id='input-telephone']")
	private WebElement telephoneField;
	
	@FindBy(xpath ="//input[@id='input-password']")
	private WebElement passwordField;
	
	@FindBy(xpath ="//input[@id='input-confirm']")
	private WebElement confirmPasswordField;
	
	@FindBy(xpath ="(//input[@name='newsletter'])[1]")
	private WebElement subscribYesButton;
	
	@FindBy(xpath="(//input[@name='newsletter'])[2]")
	private WebElement  subscribNoButton;
	
	@FindBy(xpath ="(//input[@name='agree'])")
	private WebElement privacyPolicyCheckBox;
	
	@FindBy (xpath ="(//input[@type='submit'])")
	private WebElement continueButton;
	
	@FindBy(xpath ="//h1[text()='Your Account Has Been Created!']")
	private WebElement accountCreatedMessage;
	
	
	public void clickOnMyAccount() {
		WebDriverUtility.clickOnElement(myAccount);
	}
	
	public void clickOnRegister() {
		WebDriverUtility.clickOnElement(register);
	}
	
	public void enterFirstName(String value) {
		WebDriverUtility.enterValue(firstNameField, value);
	}
	
	public void enterLastName(String value) {
		WebDriverUtility.enterValue(lastNameField, value);
	}

	public void enterEmail(String value) {
		WebDriverUtility.enterValue(emailField, value);
	}
	
	public void enterTelephone(String value) {
		WebDriverUtility.enterValue(telephoneField, value);
	}
	
	public void enterPassword(String value) {
		WebDriverUtility.enterValue(passwordField, value);
	}
	
	public void enterConfirmPassword(String value) {
		WebDriverUtility.enterValue(confirmPasswordField, value);
	}
	
	public void subscribe(String subscribeValue) {

		if(subscribeValue.equalsIgnoreCase("no")) {
			if(!subscribNoButton.isSelected()) {
				WebDriverUtility.clickOnElement(subscribNoButton);
				
			}
			
		}
	}
	
	public void clickOnPrivacyPolicyCheck() {
		if(privacyPolicyCheckBox.isDisplayed()) {
			privacyPolicyCheckBox.click();
		}
		
	}
	
	public void clickOnContinueButton() {
		WebDriverUtility.clickElementWithJS(continueButton);
	}
	
	public boolean registrationOutCome() {
		
		boolean  successMessage = accountCreatedMessage.isDisplayed();
		return successMessage;
		
	}
	
}
