package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ValidatePricePageObject;
import utilities.WebDriverUtility;

public class ValidatePriceStepDefinition extends Base {
	
	ValidatePricePageObject vp = new ValidatePricePageObject();
	
	
	@When("^User click on Laptop &NoteBooktab$")
	public void user_click_on_Laptop_NoteBooktab() throws Throwable {
		vp.clickOnLaptopsAndNotebooksTab();
		logger.info("user click on laptop and notebooks tabl");
		
	}

	@When("^User click on Show all Laptop &NoteBookoption$")
	public void user_click_on_Show_all_Laptop_NoteBookoption() throws Throwable {
		vp.clickOnShowAllLaptopsNotebook();
		logger.info("user click on show all laptops and notebooks ");
	}

	@When("^User click on ‘MacBook Pro’item$")
	public void user_click_on_MacBook_Pro_item() throws Throwable {
		vp.clickOnMacbookPro();
		logger.info("user click on macpbook pro");
	}

	@Then("^User should see ‘$2,000.00’price tag is present on UI")
	public void user_should_see_$_price_tag_is_present_on_UI() throws Throwable {
		
		Assert.assertTrue(vp.userShouldSeeMacBookProPrice());
		logger.info("user should see the item price");
		WebDriverUtility.screenShot();
	}

}
