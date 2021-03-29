package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CreateAccountPageObject;
import utilities.WebDriverUtility;

public class CreateAccountStepDefinitions extends Base {
	
	
	CreateAccountPageObject account = new CreateAccountPageObject();
	
	
	
	@When("^User click on My Account$")
	public void user_click_on_My_Account() throws Throwable {
		
		account.clickOnMyAccount();
		logger.info("user click on my account");
	
	}

	@When("^User click on Register$")
	public void user_click_on_Register() throws Throwable {

		account.clickOnRegister();
		logger.info("user click on register");
	
	}

	@When("^User fill the below information$")
	public void user_fill_the_below_information(DataTable personelInfo) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		List<Map<String , String >> dataValues = personelInfo.asMaps(String.class, String.class);
		
		account.enterFisrtName(dataValues.get(0).get("firstName"));
		account.enterLastName(dataValues.get(0).get("lastName"));
		account.enterEmail(dataValues.get(0).get("email"));
		account.enterTelephone(dataValues.get(0).get("telephone"));
		account.enterPassword(dataValues.get(0).get("password"));
		account.enterPasswordConfirm(dataValues.get(0).get("passwordConfirm"));
		account.clickOnSubscribeNo(dataValues.get(0).get("subscribe"));
		
		logger.info("user fill the infomation form");
		
	}

	@When("^User click on PrivacyPolicy check box$")
	public void user_click_on_PrivacyPolicy_check_box() throws Throwable {

		account.clickOnPrivacyPolicyCheckBox();
		logger.info("user click on privacyPolicy check box ");
		WebDriverUtility.screenShot();
	
	}

	@When("^User click on Continue button$")
	public void user_click_on_Continue_button() throws Throwable {

		account.clickOnContinueButton();
		logger.info("user click on continue button");
		
	
	}

	@Then("^User should see a welcome massage$")
	public void user_should_see_a_welcome_massage() throws Throwable {

		Assert.assertTrue(account.registerationOutCome());
		logger.info("account successfully created");
	
	}

}
