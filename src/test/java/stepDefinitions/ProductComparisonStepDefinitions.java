package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ProductComparisonPageObj;

public class ProductComparisonStepDefinitions extends Base{
	
	ProductComparisonPageObj pc = new ProductComparisonPageObj();
	
	
	
	@When("^User click on Laptop & Note Book option$")
	public void user_click_on_Laptop_Note_Book_option() throws Throwable {

		pc.userClickOnLaptopsAndNotebooks();
		logger.info("user click on laptop and Note Book ");
	
	
	}

	@When("^User click on Show all Laptop & Note Book option$")
	public void user_click_on_Show_all_Laptop_Note_Book_option() throws Throwable {

		pc.userClickOnShowAllLaptopsAndNotebooks();
		logger.info("user click on show alla laptop and note Book");
	
	
	}

	@When("^User click on product comparison icon on 'Mac Book'$")
	public void user_click_on_product_comparison_icon_on_Mac_Book() throws Throwable {

		pc.userClickOnCompareThisProductMacBook();
		logger.info("user click on product comparison icon on Mac Book");
	
	}

	@When("^User click on product comparison icon on 'Mac Book Air'$")
	public void user_click_on_product_comparison_icon_on_Mac_Book_Air() throws Throwable {

		pc.userClickOnCompareThisProductMacBookAir();
		logger.info("user click on product comparison icon on Mc Book Air");
	
	
	}

	@Then("^User should see a message 'Success: you have added Mac Book Air to your product comparison!'$")
	public void user_should_see_a_message_Success_you_have_added_Mac_Book_Air_to_your_product_comparison() throws Throwable {

		pc.userShouldSeeALinkToComparisonTable();
		logger.info("user should see a message 'Success you have added Mac Book and Mac Book Air to Chart'");
	
	
	}

	@Then("^User click on product comparison link$")
	public void user_click_on_product_comparison_link() throws Throwable {

	pc.userClickOnTheLinkToComparisonChart();
	logger.info("user click on product comparison link");
	
	}

	@Then("^User should see Product Comparison Chart$")
	public void user_should_see_Product_Comparison_Chart() throws Throwable {


		pc.userShouldSeeComparisonTable();
		logger.info("user should see producrt comparison chart");
	
	}
	
	

}
