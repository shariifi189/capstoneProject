package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class MacBookPageObject extends Base {
	
	public MacBookPageObject() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement searchBar;
	
	
	@FindBy(xpath="(//button[@type='button'])[4]")
	private WebElement searchButtom;
	
	@FindBy(xpath ="//img[@title='MacBook']")
	private WebElement macBookImage;
	
	
	public void enterMacBookInToSeachBar(String value) {
		WebDriverUtility.enterValue(searchBar, value);
		logger.info("user enterd macBook in to search bar");
	}

	public void clickOnSearchButton() {
		
		WebDriverUtility.clickOnElement(searchButtom);
	}

	public boolean macBookImageIsDisplayed() {
		if(macBookImage.isDisplayed())
			return true;
		else
			return false;
		
	}

}
