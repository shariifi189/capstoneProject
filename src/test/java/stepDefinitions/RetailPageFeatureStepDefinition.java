package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Given;
import pageObjects.RetailPageFeaturePageObject;

public class RetailPageFeatureStepDefinition extends Base {
	RetailPageFeaturePageObject rp = new RetailPageFeaturePageObject();
	
	
	@Given("^User click on MyAccount$")
	public void user_click_on_MyAccount() throws Throwable {

		rp.clickOnMyAccount();
		logger.info("user click on my account");
		
	
	
	}
	
	

}
