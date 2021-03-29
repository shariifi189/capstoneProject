package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class AddReviewToCanonPageObject extends Base {
	
	public AddReviewToCanonPageObject() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath ="//a[text()='Canon EOS 5D']")
	private WebElement canonEOS5D;
	
	@FindBy(xpath ="//a[text()='Reviews (0)']")
	private WebElement reviews;
	
	@FindBy(xpath="//input[@id='input-name']")
	private WebElement yourNameField;
	
	@FindBy(xpath ="//textarea[@id='input-review']")
	private WebElement yourReviewTextArea;
	
	@FindBy(xpath ="//input[@value='5']")
	private WebElement goodRating;
	
	@FindBy(xpath = "//input[@value='1']")
	private WebElement badRating;
	
	@FindBy(xpath="//button[@id='button-review']")
	private WebElement continueButton;
	
	@FindBy(xpath ="//div[@class='alert alert-success alert-dismissible']")
	private WebElement message;
	
	
	public void clickOnCanonEOS5D() {
		
		WebDriverUtility.clickOnElement(canonEOS5D);
		
	}
	
	public void clickOnReviews() {
		
		WebDriverUtility.clickOnElement(reviews);
		
	}
	
	public void enterYourName(String yourName) {
		
		WebDriverUtility.enterValue(yourNameField, yourName);
	}
	
	public void enterYourReview(String yourReview) {
		
		WebDriverUtility.enterValue(yourReviewTextArea, yourReview);
		
	}
	
	public void ClickOnRating(String value) {
		
		if(value.equalsIgnoreCase("good")) {
			goodRating.click();
		}else {
			badRating.click();
		}
		
		
	}
	
	public void ClickOnContinueButton() {
		
		WebDriverUtility.clickOnElement(continueButton);
		
	}
	
	public boolean reviewOutComeMessage() {
		
		boolean reviewOutCome = message.isDisplayed();
		return reviewOutCome;
		
		
		
	}
	
	
	

}
