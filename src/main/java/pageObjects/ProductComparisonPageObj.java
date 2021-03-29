package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class ProductComparisonPageObj extends Base {
	
	public ProductComparisonPageObj() {
		
		PageFactory.initElements(driver, this);
		
	}
	

	@FindBy(xpath="(//a[@class='dropdown-toggle'])[3]")
	private WebElement laptopAndNotebooks;
	
	@FindBy(xpath ="//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooks;
	
	@FindBy(xpath ="(//button[@type='button'])[14]")
	private WebElement compareThisProductMacBook;
	// the number changes when we click on compare button ont mac book
	@FindBy(xpath ="(//button[@type='button'])[18]")
	private WebElement compareThisProductMacBookAir;
	
	@FindBy(xpath ="//a[text()='product comparison']")
	private WebElement compareLink;
	
	@FindBy(xpath ="//div[@id='content']")
	private WebElement productComparisonTable;
	
	
	public void userClickOnLaptopsAndNotebooks() {
		
		WebDriverUtility.clickOnElement(laptopAndNotebooks);
		
	}
	
	public void userClickOnShowAllLaptopsAndNotebooks() {
		
		WebDriverUtility.clickOnElement(showAllLaptopsAndNotebooks);
		
	}
	
	public void userClickOnCompareThisProductMacBook() throws InterruptedException {
		
		WebDriverUtility.clickOnElement(compareThisProductMacBook);
		Thread.sleep(5000);
		
	}
	
	public void userClickOnCompareThisProductMacBookAir() {
		
		WebDriverUtility.clickOnElement(compareThisProductMacBookAir);
		
	}
	
	
	public void userShouldSeeALinkToComparisonTable() {
		
		WebDriverUtility.getText(compareLink);
		
	}
	
	public void userClickOnTheLinkToComparisonChart() {
		
		WebDriverUtility.clickOnElement(compareLink);
	}
	
	public void userShouldSeeComparisonTable() {
		
		WebDriverUtility.isElementDisplayed(productComparisonTable);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
