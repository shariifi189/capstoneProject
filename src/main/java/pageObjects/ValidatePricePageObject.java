package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class ValidatePricePageObject extends Base {

	public ValidatePricePageObject() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsNatebooksTab;

	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsNotbooks;

	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement macBookPro;

	@FindBy(xpath = "(//ul[@class='list-unstyled'])[10]")
	private WebElement macBookProPrice;

	public void clickOnLaptopsAndNotebooksTab() {
		WebDriverUtility.clickOnElement(laptopsNatebooksTab);
	}

	public void clickOnShowAllLaptopsNotebook() {
		WebDriverUtility.clickOnElement(showAllLaptopsNotbooks);
	}

	public void clickOnMacbookPro() {
		WebDriverUtility.clickOnElement(macBookPro);
	}

	public boolean userShouldSeeMacBookProPrice() {

		if (macBookProPrice.isDisplayed())
			return true;
		else
			return false;

	}

}
