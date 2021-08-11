package stepDefinitions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AccountRegisterPageObje;
import utilities.WebDriverUtility;

public class AccountRegisterStepDefinition extends Base{
	
	AccountRegisterPageObje accountRegister = new AccountRegisterPageObje();
	

	@When("^User click on My Account$")
	public void user_click_on_My_Account() throws Throwable {
		
		accountRegister.clickOnMyAccount();
		logger.info("user click on myAccount");
	
	
	}

	@When("^User click on Register$")
	public void user_click_on_Register() throws Throwable {

	accountRegister.clickOnRegister();
	logger.info("user click on register");
	
	}

	@When("^User fill the Regeration form with below information$")
	public void user_fill_the_Regeration_form_with_below_information(DataTable personelInfo) throws Throwable {
		List<Map<String, String>> dataValues = personelInfo.asMaps(String.class, String.class);
		
		accountRegister.enterFirstName(dataValues.get(0).get("FirstName"));
		accountRegister.enterLastName(dataValues.get(0).get("LastName"));
		accountRegister.enterEmail(dataValues.get(0).get("Email"));
		accountRegister.enterTelephone(dataValues.get(0).get("Telephone"));
		accountRegister.enterPassword(dataValues.get(0).get("Password"));
		accountRegister.enterConfirmPassword(dataValues.get(0).get("Password Confirm"));	
		accountRegister.subscribe(dataValues.get(0).get("Subscribe"));
		
		logger.info("user filled the information form");
		WebDriverUtility.screenShot();
	}

	@When("^User check the privacy policy$")
	public void user_check_the_privacy_policy() throws Throwable {
		accountRegister.clickOnPrivacyPolicyCheck();
		logger.info("user checked provacy policy checkbox");
		
	}

	@When("^User Click continue button$")
	public void user_Click_continue_button() throws Throwable {
		accountRegister.clickOnContinueButton();
		logger.info("user click on continue button");
	}

	@Then("^User should see a system generted massage$")
	public void user_should_see_a_system_generted_massage() throws Throwable {
		
		accountRegister.registrationOutCome();
		logger.info("user should see a system generated message");
		WebDriverUtility.screenShot();
	}
	
	

}
