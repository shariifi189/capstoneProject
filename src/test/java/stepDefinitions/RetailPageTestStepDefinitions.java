//package stepDefinitions;
//
//import java.util.List;
//import java.util.Map;
//
//import org.junit.Assert;
//
//import core.Base;
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import freemarker.log.Logger;
//import pageObjects.RetailPageObj;
//import utilities.WebDriverUtility;
//
//public class RetailPageTestStepDefinitions extends Base {
//
//	// in this class we will write actual java selenium condes associated to each
//	// scenario stepps
//	//
//
//	RetailPageObj retailPage = new RetailPageObj();
//
//	@When("^User search for '(.+)'$")
//	public void user_search_for_iphone(String value) throws Throwable {
//	
//		retailPage.enterValueToSearchBar(value);
//		logger.info("User entered value in search bar");
//		WebDriverUtility.screenShot();
//		
//		
//		
//	}
//
//	@When("^User click on search button$")
//	public void user_click_on_search_button() throws Throwable {
//		
//		retailPage.clickOnSearchButton();
//		logger.info("User clicked on search button");
//	
//	}
//
//	@Then("^User should see Iphone image$")
//	public void user_should_see_Iphone_image() throws Throwable {
//	
//		Assert.assertTrue(retailPage.iphoneImageIsDisplayed());
//	WebDriverUtility.screenShot();
//	
//	}
//	
//	
//	
//	
//	
//
//	@When("^User click on MyAccount$")
//	public void user_click_on_MyAccount() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//
//	}
//
//	@When("^User click on Register option$")
//	public void user_click_on_Register_option() throws Throwable {
//		retailPage.clickOnRegister();
//		logger.info("User clicked on Register option");
//		
//	}
//
//	@When("^User fill the Registeration form with below information$")
//	public void user_fill_the_Registeration_form_with_below_information(DataTable personalInfo) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//
//		List<Map<String,String>> dataValues = personalInfo.asMaps(String.class, String.class);
//		retailPage.enterFirstName(dataValues.get(0).get("firstName"));
//		retailPage.enterLasstName(dataValues.get(0).get("lastName"));
//		retailPage.enterEmail(dataValues.get(0).get("email"));
//		retailPage.enterPhoneNumber(dataValues.get(0).get("telephone"));
//		retailPage.enterPassword(dataValues.get(0).get("pasword"));
//		retailPage.enterConfromPasswordField(dataValues.get(0).get("confimPassword"));
//		retailPage.enterEmail(dataValues.get(0).get("subscribe"));
//		logger.info("User filled the infromation form ");
//		WebDriverUtility.screenShot();
//		
//	}
//
//	@When("^User accept the privacy and policy$")
//	public void user_accept_the_privacy_and_policy() throws Throwable {
//		retailPage.checkPrivacyPolicy();
//		WebDriverUtility.screenShot();
//		logger.info("User check privacy and policy");
//	}
//
//	@When("^User click on Continue button$")
//	public void user_click_on_Continue_button() throws Throwable {
//
//		retailPage.clickOncontinueButton();
//		logger.info("User click on continue button");
//	}
//
//	@Then("^User should be registered on retail website$")
//	public void user_should_be_registered_on_retail_website() throws Throwable {
//
//		Assert.assertTrue(retailPage.registrationOutCome());
//		WebDriverUtility.screenShot();
//		logger.info("User created an account succefully");
//	}
//	
//	
//	
//	
//	
//	
//}
