package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class CreateAccountPageObject extends Base {

	public CreateAccountPageObject() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement myAccount;

	@FindBy(xpath = "//a[contains(text(),'Register')]")
	private WebElement register;

	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstNameField;

	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastNameField;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emailField;

	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telephoneField;

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@id='input-confirm']")
	private WebElement passwordConfirmField;

	@FindBy(xpath = "(//input[@value='1'])[2]")
	private WebElement subscribeYes;

	@FindBy(xpath = "//input[@value='0']")
	private WebElement subscribeNo;

	@FindBy(xpath = "(//input[@value='1'])[3]")
	private WebElement privacyPolicyCheckBox;

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement continueButton;

	@FindBy(xpath ="//h1[text()='Your Account Has Been Created!']")
	private WebElement accountCreateMessage;
	
	public void clickOnMyAccount() {

		WebDriverUtility.clickOnElement(myAccount);

	}

	public void clickOnRegister() {

		WebDriverUtility.clickOnElement(register);

	}

	public void enterFisrtName(String fName) {
		WebDriverUtility.enterValue(firstNameField, fName);
	}

	public void enterLastName(String lName) {
		WebDriverUtility.enterValue(lastNameField, lName);
	}

	public void enterEmail(String email) {
		WebDriverUtility.enterValue(emailField, email);
	}

	public void enterTelephone(String telephone) {
		WebDriverUtility.enterValue(telephoneField, telephone);
	}

	public void enterPassword(String pasword) {
		WebDriverUtility.enterValue(passwordField, pasword);
		WebDriverUtility.wait(4000);
	}

	public void enterPasswordConfirm(String passwordConfrim) {
		WebDriverUtility.enterValue(passwordConfirmField, passwordConfrim);
		WebDriverUtility.wait(4000);
	}

	public void clickOnSubscribeNo(String subscribeButton) {
		if (subscribeButton.equalsIgnoreCase("No")) {
			WebDriverUtility.clickOnElement(subscribeNo);
		} else {
			WebDriverUtility.clickOnElement(subscribeYes);
		}
	}

	public void clickOnPrivacyPolicyCheckBox() {

		if (privacyPolicyCheckBox.isDisplayed())
			WebDriverUtility.clickOnElement(privacyPolicyCheckBox);

	}
	
	public void clickOnContinueButton() {
		WebDriverUtility.clickOnElement(continueButton);
	}
	
	public boolean registerationOutCome() {
		
		boolean successMessage = accountCreateMessage.isDisplayed();
		return successMessage;
		
	}
	
	
	
	
	
	
	
	
	

}
