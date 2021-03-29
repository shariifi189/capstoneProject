package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.WebDriverUtility;

public class AddAndRemoveMacBookPageObject extends Base {

	public AddAndRemoveMacBookPageObject() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopAndNoteBookTabs;

	@FindBy(xpath = "(//a[@class='see-all'])[2]")
	private WebElement showAllLaptopAndNoteBooks;

	@FindBy(xpath = "(//button[@type='button'])[13]")
	private WebElement addToCartMacBook;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successAddToCartMassage;

	@FindBy(xpath = "(//button[@type='button'])[5]")
	private WebElement loadedCart;

		
	@FindBy(xpath = "(//button[@type='button'])[6]")
	private WebElement crossButton;

	@FindBy(xpath = "(//button[@type='button'])[5]")
	private WebElement emptyCart;

	public void clickOnLaptopsAndNotebooksTabss() {

		WebDriverUtility.clickOnElement(laptopAndNoteBookTabs);
	}
	
	public void clickOnShowAllLaptopsAndNoteBooks() {
		WebDriverUtility.clickOnElement(showAllLaptopAndNoteBooks);
	}
	
	public void clickOnAddToCartMacBook() {
		WebDriverUtility.clickOnElement(addToCartMacBook);
	}
	
	public void userShouldSeeASuccessMassege() {
		WebDriverUtility.getText(successAddToCartMassage);
	}
	
	public void userShouldSeeItemAddedToCart() {
		WebDriverUtility.getText(loadedCart);
	}
	
	public void userClickOnCart() {
		WebDriverUtility.clickOnElement(loadedCart);
	}
	
	
	public void removeMacBookFromCart() {
		WebDriverUtility.clickOnElement(crossButton);
	}
	
	public void userShouldSeeEmptyCart() {
		WebDriverUtility.getText(emptyCart);
	}
	
	
	
	
	
	
	
	

}
