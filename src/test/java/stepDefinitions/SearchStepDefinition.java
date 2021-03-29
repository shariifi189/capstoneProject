package stepDefinitions;

import core.Base;
import cucumber.api.java.en.When;
import pageObjects.SearchPageObject;

public class SearchStepDefinition extends Base {

	SearchPageObject sp = new SearchPageObject();

	@When("^User click on search button$")
	public void user_click_on_search_button() throws Throwable {

		sp.userClickOnSearchButton();
		logger.info("user click on the earch button");

	}
}