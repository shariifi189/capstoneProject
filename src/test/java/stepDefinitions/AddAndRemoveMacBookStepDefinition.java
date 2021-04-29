package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jdk.internal.org.jline.utils.Log;
import pageObjects.AddAndRemoveMacBookPageObject;
import utilities.WebDriverUtility;

public class AddAndRemoveMacBookStepDefinition extends Base {

	AddAndRemoveMacBookPageObject addMac = new AddAndRemoveMacBookPageObject();

	@When("^User click on Latop&NoteBooktab$")
	public void user_click_on_LatopNoteBooktab() throws Throwable {

		addMac.clickOnLaptopsAndNotebooksTabss();
		Log.info("user click on laptop and notebook tab");
	
	}
 
	////
	@When("^User click on Show all Laptop and NoteBookOption$")
	public void user_click_on_Show_all_Laptop_and_NoteBookOption() throws Throwable {

	addMac.clickOnShowAllLaptopsAndNoteBooks();
	Log.info("user click on show all laptop and notebooks");
	}

	@When("^User click on clickadd to Cart button$")
	public void user_click_on_clickadd_to_Cart_button() throws Throwable {

		addMac.userClickOnCart();
		Log.info("user click on add to cart button");
	
	}

	@Then("^User should see a message 'Success: You have add MacBook to your shopping cart!'$")
	public void user_should_see_a_message_Success_You_have_add_MacBook_to_your_shopping_cart() throws Throwable {

		addMac.userShouldSeeASuccessMassege();
		Log.info("user should see a massege");
	
	}

	@Then("^User shold see '(.+)'showed to the cart$")
	public void user_shold_see_item_s_shosed_to_the_cart() throws Throwable {

		addMac.userShouldSeeItemAddedToCart();
		Log.info("user should see item in the cart");
		
	}

	@Then("^User click on cart option$")
	public void user_click_on_cart_option() throws Throwable {

		addMac.userClickOnCart();
		Log.info("user click on the cart");
	
	}

	@Then("^User Click on the red X button to remove the item from car$")
	public void user_Click_on_the_red_X_button_to_remove_the_item_from_car() throws Throwable {

		addMac.removeMacBookFromCart();
		Log.info("user click on the red X button to remove item from the cart");
	
	
	}

	@Then("^item should be removed and cartshould show '(.+)'$")
	public void item_should_be_removed_and_cartshould_show_item_S(int arg1) throws Throwable {

		addMac.userShouldSeeEmptyCart();
		Log.info("user should see empty cart");
	
	}

}
