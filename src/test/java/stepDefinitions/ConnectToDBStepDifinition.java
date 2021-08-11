package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Data;
import utilities.DataBaseUtility;

public class ConnectToDBStepDifinition extends Base {

	@Given("^User connect to postgreSql DataBase$")
	public void user_connect_to_postgreSql_DataBase() throws Throwable {
	DataBaseUtility.setupConnection();
	logger.info("connection is estabished btw jdbc and db");
	
	
	}

	@When("^User sends querry '(.+)'$")
	public void user_sends_querry_select_from_public_actor(String query) throws Throwable {
	
		DataBaseUtility.runQuery(query);
		logger.info(query + ": has been executed");
	}

	@Then("^User should get all the information from that table$")
	public void user_should_get_all_the_information_from_that_table() throws Throwable {
	
	DataBaseUtility.returnResult();
	logger.info("ResultSet is stored in a csv file in outcome foler");
	DataBaseUtility.closeDBConnection();
	logger.info("database connection has been closed");
	
	}
	
	
	
}
