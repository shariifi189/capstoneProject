package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CanonAddToCartPageObject;

public class CanonAddToCartStepDefinition extends Base {

	CanonAddToCartPageObject canon = new CanonAddToCartPageObject();
	
	@When("^User click on Desktopstab$")
	public void user_click_on_desktopstab() {
		
		canon.userClickOnDesktops();
		logger.info("user click on desktops");
	}
	
	
	@When("^User click on Show All Desktops$")
	public void user_click_on_Show_All_Desktops() throws Throwable {

	canon.userClickOnAllDesktops();
	logger.info("user click on show all Desktops");
	
	
	}

	@When("^User Click Add to Cart option on 'Canon EOS 5D' item$")
	public void user_Click_Add_to_Cart_option_on_Canon_EOS_D_item() throws Throwable {
		
		canon.userClickOnAddToCart();
		logger.info("user click on add to cart ");
		
	}

	@When("^User select color from dropdown 'Red'$")
	public void user_select_color_from_dropdown_Red() throws Throwable {

		canon.userSelectOption();
		logger.info("user select from the option");
	
	}

	@When("^User select quantity '1'$")
	public void user_select_quantity() throws Throwable {

		canon.userClearQuantityAndAddQuantity();
		logger.info("user clear the quantity and add quantity");
	}

	@When("^User click on the cart button$")
	public void user_click_on_the_cart_button() throws Throwable {

	canon.userClickOnAddToCartButtom();
	logger.info("user click on add to cart button");
	
	}

	@Then("^User should see a massgae 'Success: you have added Canon EOS5D to you shopping cart!'$")
	public void user_should_see_a_massgae_Success_you_have_added_Canon_EOS_D_to_you_shopping_cart()
			throws Throwable {
		
		canon.userShouldSeeSuccessMassage();
		logger.info("user added conon successfully");

	}

}
