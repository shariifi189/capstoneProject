package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class SearchPageObject extends Base {
	
	public SearchPageObject() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath ="(//button[@type='button'])[4]")
	private WebElement searchButton;
	

	public void userClickOnSearchButton() {
		
		WebDriverUtility.clickOnElement(searchButton);
		WebDriverUtility.wait(5000);
		
	}
	
	
	
	
}
