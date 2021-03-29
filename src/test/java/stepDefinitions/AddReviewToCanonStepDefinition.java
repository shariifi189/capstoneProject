package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AddReviewToCanonPageObject;
import utilities.WebDriverUtility;

public class AddReviewToCanonStepDefinition extends Base {

	
	
	AddReviewToCanonPageObject cr = new AddReviewToCanonPageObject();
	
	@When("^User click on Canon EOS 5D item$")
	public void user_click_on_Canon_EOS_D_item() throws Throwable {
		
		cr.clickOnCanonEOS5D();
		logger.info("user click on Canon EOS 5D");
		
		
	}

	@When("^User click on write  a review link$")
	public void user_click_on_write_a_review_link() throws Throwable {
		
		cr.clickOnReviews();
		logger.info("user click on review link");
	}

	@When("^User fill the review information with bellow information$")
	public void user_fill_the_review_information_with_bellow_information(DataTable personelInfo) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		List<Map<String, String>> dataValues = personelInfo.asMaps(String.class, String.class);
		
		cr.enterYourName(dataValues.get(0).get("yourName"));
		cr.enterYourReview(dataValues.get(0).get("yourReview"));
		cr.ClickOnRating(dataValues.get(0).get("rating"));
		
		logger.info("user entered review information ");
		
	}

	@When("^User click on Continue Button$")
	public void user_click_on_Continue_Button() throws Throwable {
		
		cr.ClickOnContinueButton();
		logger.info("user click on continue button");
	}

	@Then("^User should see a message with 'Thank you for your review it has been submitted to the webmaster for approval.'$")
	public void user_should_see_a_message_with_Thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() throws Throwable {
	
		Assert.assertTrue(cr.reviewOutComeMessage());
		logger.info("user should see a message 'review has been submited to webmaster'");
		 WebDriverUtility.screenShot();
		 
	
	}
	
	
}
