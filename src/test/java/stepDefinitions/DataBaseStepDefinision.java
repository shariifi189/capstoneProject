package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Data;
import utilities.DataBaseUtility;
import utilities.WebDriverUtility;

public class DataBaseStepDefinision extends Base {

	@Given("^User connects to PostgreSql Database$")
	public void user_connect_to_postgreSQL_database() {
		
		DataBaseUtility.setupConnection();
		logger.info("conncetion is established between JDBA and DB");
		

	}

	
	
	@When("^User sends query '(.+)'$")
	public void user_sends_querry(String querry) {

		DataBaseUtility.runQuery(querry);
		logger.info(querry + ":has been excuted ");
	}

	@Then("^User should get all information from that table$")
	public void user_should_get_all_information_from_that_table() {

		DataBaseUtility.returnResult();
		logger.info("ResultSet is stored in a csv file in outcome folder");
		DataBaseUtility.closeDBConnection();
		logger.info("DataBase conncetion has been closed");
	}

}
