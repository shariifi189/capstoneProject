package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class RetailPageObj  extends Base {

	// once we create the page obj we need to extend the base class to use parent class
	// properties such is webdriver driver
	
	//we create a constructor and inside the constructor we define the pagefactory.initElement 
	// method to intialize the webelement in this page
	
	public RetailPageObj() {
		
		PageFactory.initElements(driver, this);
	}
	
	// we need to stroe ui webelement in a private webelement using @findby annotations of 
	//pagefactory class
	
//	@FindBy ( xpath = "//input[@name='search']")
//	private WebElement searchBar;
//	
//	@FindBy (xpath ="//button[@class='btn btn-default btn-lg']")
//	private WebElement searchButton;
//	
//	@FindBy(xpath ="//img[@title='iPhone']")
//	private WebElement iphoneImage;
//	
//	
//	
//	
//	//Register form UI elements for myaccount registry form 
//	
//	
//	@FindBy(xpath="(//a[text()='Register'])[1]")
//	private WebElement registerOption;
//	
//	@FindBy(xpath ="//input[@id='input-firstname']")
//	private WebElement firstNameField;
//	
//	@FindBy (xpath ="//input[@id='input-lastname']")
//	private WebElement lastNameField;
//	
//	@FindBy (xpath="//input[@id='input-email']")
//	private WebElement emailField;
//	
//	@FindBy (xpath ="//input[@id='input-telephone']")
//	private WebElement phoneNumberField;
//	
//	@FindBy (xpath ="//input[@id='input-password']")
//	private WebElement passwordField;
//	
//	@FindBy (xpath="//input[@id='input-confirm']")
//	private WebElement conformPasswordField;
//	
//	@FindBy(xpath="(//input[@name='newsletter'])[1]")
//	private WebElement yesSubscribeButton;
//	
//	@FindBy (xpath ="(//input[@name='newsletter'])[2]")
//	private WebElement noSubscribeButton;
//	
//	@FindBy (xpath="(//input[@name='agree'])[1]")
//	private WebElement privacyPolicyCheckBox;
//	
//	@FindBy(xpath ="(//input[@type='submit'])[1]")
//	private WebElement continueButton;
//	
//	@FindBy(xpath ="//h1[text()='Your Account Has Been Created!']")
//	private WebElement accountCreatedMassage;
//	
//	
//	
//	
//	// Methods for the search bar 
//	
//	public void enterValueToSearchBar(String value) {
//		WebDriverUtility.enterValue(searchBar, value);
//	}
//	
//	public void clickOnSearchButton() {
//		WebDriverUtility.clickOnElement(searchButton);
//	}
//	
//	public boolean iphoneImageIsDisplayed() {
//		if (iphoneImage.isDisplayed())
//			return true;
//			else
//				return false;
//	}
//	
//	// need to create method to perform on each web element for registering an account
//	
//	
//	public void clickOnRegister() {
//		WebDriverUtility.clickOnElement(registerOption);
//	}
//	
//	public void enterFirstName(String fName) {
//		WebDriverUtility.enterValue(firstNameField, fName);
//	}
//	
//	public void enterLasstName(String lName) {
//		WebDriverUtility.enterValue(lastNameField, lName);
//	}
//	
//	public void enterEmail(String emaill) {
//		WebDriverUtility.enterValue(emailField, emaill);
//	}
//	
//	public void enterPhoneNumber(String phoneNumber	) {
//		WebDriverUtility.enterValue(phoneNumberField, phoneNumber);
//	}
//	
//	public void enterPassword(String password) {
//		WebDriverUtility.enterValue(passwordField, password);
//	}
//
//	public void enterConfromPasswordField(String conformPassword) {
//		WebDriverUtility.enterValue(conformPasswordField, conformPassword);
//	}
//	
//	public void subscribeButton(String valueOfSubscribe) {
//		WebDriverUtility.clickOnElement(noSubscribeButton);
//		if(valueOfSubscribe.equalsIgnoreCase("yes")) {
//			if(!yesSubscribeButton.isSelected())
//			WebDriverUtility.clickOnElement(yesSubscribeButton);
//		}else {
//			WebDriverUtility.clickOnElement(noSubscribeButton);
//		}
//	}
//	
//	public void checkPrivacyPolicy() {
//		if(privacyPolicyCheckBox.isDisplayed()) {
//			privacyPolicyCheckBox.click();
//	}
//	}
//	
//	public void clickOncontinueButton() {
//		WebDriverUtility.clickOnElement(continueButton);
//	}
//	
//	public boolean registrationOutCome() {
//		boolean successMassage = accountCreatedMassage.isDisplayed();
//		return successMassage;
//	}
//	
}
