package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HPLP3065PageObj;
import utilities.WebDriverUtility;

public class HPLP3065StepDefinition extends Base{
	
	HPLP3065PageObj hp = new HPLP3065PageObj();
	
	
	
	@When("^User click on Desktops tab$")
	public void user_click_on_Desktops_tab() throws Throwable {

		hp.userClickOnDesktops();
		logger.info("user click on desktops tab");
		
	
	}

	@When("^User click on Show all Desktops$")
	public void user_click_on_Show_all_Desktops() throws Throwable {

		hp.userClickOnAllDesktops();
		logger.info("user click on allesktops");
	
	}

	@When("^User click ADD TO CART option on HP LP item$")
	public void user_click_ADD_TO_CART_option_on_HP_LP_item() throws Throwable {

		hp.userClickOnHpAddToCartButton();
		logger.info("user add hp to the cart");
		
	
	}

	@When("^User select quanitity 1$")
	public void user_select_quanitity() throws Throwable {

		hp.usserClearQuantityAndAddQuantitiy();
	
	}

	@When("^User click add to Cart button$")
	public void user_click_add_to_Cart_button() throws Throwable {

		hp.userClickOnAddToCartButton();
		logger.info("user click on add to cart button");
	
	}
	

	@Then("^User should see a massage 'Success: you have added HP LP 3065 to your Shopping cart!'$")
	public void user_should_see_a_massage_Success_you_have_added_HP_LP_to_your_Shopping_cart() throws Throwable {

		hp.userShouldSeeSuccessMassage();
		logger.info("user should she the massage ");
		WebDriverUtility.screenShot();
		
	
	}
	
	
	
	
	
	
	

}
