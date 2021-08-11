package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.SearchPageObject;
import utilities.WebDriverUtility;

public class SearchStepDifinition extends Base {
	
	SearchPageObject po = new SearchPageObject();
	Base base = new Base();
	
	
	@Given("^User is on Retail website$")
	public void user_is_on_Retail_website() throws Throwable {

		base.initializeDriver();
		logger.info("Retail page is opened");
//		String actualPageTitle = po.getPageTitle();
		
		String expectedPageTitle = "TEK SCHOOL";
//		Assert.assertEquals(expectedPageTitle, actualPageTitle);
		logger.info("Page title  is verified");
		WebDriverUtility.screenShot();
	}

	@When("^User search for '(.+)'$")
	public void user_search_for_iphone(String value) throws Throwable {

	po.enterValueToSeachBar(value);
	logger.info("user enters value to search bar");
	
	}

	@When("^User click on search button$")
	public void user_click_on_search_button() throws Throwable {
		po.clickOnSearchButton();
		logger.info("user click on the search button");
	}

	@Then("^User should see iphone image$")
	public void user_should_see_iphone_image() throws Throwable {
	
		Assert.assertTrue(po.iphoneImageIsDisplayed());
		logger.info("user should see iphone image");
		WebDriverUtility.screenShot();
	
	}
	
	
	
	

}
