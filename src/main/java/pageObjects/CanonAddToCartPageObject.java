package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class CanonAddToCartPageObject  extends Base {
	
	
	public CanonAddToCartPageObject(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="(//a[@class='dropdown-toggle'])[2]")
	private WebElement desktops;
	
	@FindBy(xpath="(//a[@class='see-all'])[1]")
	private WebElement allDesktops;
	
	@FindBy(xpath ="(//button[@type='button'])[12]")
	private WebElement addToCart;
	
	@FindBy(xpath="//select[@id='input-option226']")
	private WebElement selectOption;
	
	@FindBy(xpath= "//input[@id='input-quantity']")
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

	public void userClickOnAddToCart() {
		
		WebDriverUtility.clickOnElement(addToCart);
	}


	public void userSelectOption() {
		
		WebDriverUtility.selectByIndex(selectOption, 1);
		
	}
	
	public void userClearQuantityAndAddQuantity() {
		
		WebDriverUtility.clearText(quantity);
		quantity.sendKeys("1");
		
	}


	public void userClickOnAddToCartButtom() {
		
		WebDriverUtility.clickOnElement(addToCartButton);
		
	}



	public void userShouldSeeSuccessMassage() {
		WebDriverUtility.getText(addToCartSuccessMassage);

	}











}
