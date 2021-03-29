package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.MacBookPageObject;
import utilities.WebDriverUtility;

public class MacBookStepDefinision extends Base {

	MacBookPageObject macBook = new MacBookPageObject();
	
	@When("^User search for '(.+)'$")
	public void user_search_for_macBook(String value) {
		macBook.enterMacBookInToSeachBar(value);
		logger.info("user enter value into search bar");
	}
	
	@When("^User click on search buttom$")
	public void user_click_on_search_buttom(){
		
		macBook.clickOnSearchButton();
		
	}
	
	@Then("^User should see MackBook$")
	public void user_should_see_MacBook() {
		Assert.assertTrue(macBook.macBookImageIsDisplayed());
		WebDriverUtility.screenShot();
	}
	
	
}
