package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class HPLP3065PageObj extends Base {

	public HPLP3065PageObj() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//a[@class='dropdown-toggle'])[2]")
	private WebElement desktops;
	
	@FindBy(xpath="//a[text()='Show All Desktops']")
	private WebElement allDesktops;
	
	@FindBy(xpath="(//button[@type='button'])[15]")
	private WebElement addToCart;
	
	@FindBy(xpath ="//input[@id='input-quantity']")
	private WebElement quantity;
	
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement addToCartButton;
	
	@FindBy(xpath ="//div[@class='alert alert-success alert-dismissible']")
	private WebElement addToCartSuccessMassage;
	
	
	public void userClickOnDesktops() {
	
		WebDriverUtility.clickOnElement(desktops);
	
	}
	
	public void userClickOnAllDesktops() {
		
		WebDriverUtility.clickOnElement(allDesktops);
		
	}
	
	
	public void userClickOnHpAddToCartButton() {
		
		WebDriverUtility.clickOnElement(addToCart);
		
	}
	
	public void usserClearQuantityAndAddQuantitiy() {
		
		
		WebDriverUtility.clearText(quantity);
		quantity.sendKeys("1");
	}
	

	public void userAddQuantity(String value) {

		WebDriverUtility.enterValue(quantity, value);
	
	}

	
	public void userClickOnAddToCartButton() {
		
		WebDriverUtility.clickOnElement(addToCartButton);
	}
	
	public void userShouldSeeSuccessMassage() {
		WebDriverUtility.getText(addToCartSuccessMassage);

	}
	
	
	
	
	
	
	
}
