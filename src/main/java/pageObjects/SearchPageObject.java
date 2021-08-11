package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class SearchPageObject extends Base{
	
	
	public SearchPageObject() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchBar;
	
	@FindBy(xpath ="//button[@class='btn btn-default btn-lg']")
	private WebElement searchButton;
	
	@FindBy(xpath = "//img[@title='iPhone']")
	private WebElement iphoneImage;
	

	
	public void enterValueToSeachBar(String value) {
		
		WebDriverUtility.enterValue(searchBar, value);
	}
	
	
	public void clickOnSearchButton() {
		WebDriverUtility.clickOnElement(searchButton);
	}
	
	public boolean iphoneImageIsDisplayed() {
		
		if(iphoneImage.isDisplayed())
			
			return true;
		else
			return false;
		
	}
	

	
	

}
