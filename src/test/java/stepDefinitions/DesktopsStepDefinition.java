package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.DesktopsPageObj;
import utilities.WebDriverUtility;

public class DesktopsStepDefinition extends Base {

	DesktopsPageObj desktopPageObj = new DesktopsPageObj();

	@When("^User click on desktops tab$")
	public void user_click_on_desktops_tab() throws Throwable {
		desktopPageObj.userClickOnDesktops();

	}

	@When("^User click on Show all desktops$")
	public void user_click_on_Show_all_desktops() throws Throwable {

		desktopPageObj.userClickOnShowAllDesktops();

	}

	@When("^User click on apple cinema$")
	public void user_click_on_apple_cinema() {
		desktopPageObj.userClickOnApplCinema();

	}

	@Then("^User should see apple cinema$")
	public void user_should_see_apple_cinema() {
		Assert.assertTrue(desktopPageObj.appleCinemaIsDisplayed());
		logger.info("user should see apple cinema 30");
		WebDriverUtility.screenShot();
		driver.navigate().back();
	}

	@When("^User click on canon EOS 5D$")
	public void user_click_on_canon() {
		desktopPageObj.userClickOnCanonEOS5D();
	}

	@Then("^User should see canon EOS 5D$")
	public void user_should_see_conon_EOS_5D() {
		Assert.assertTrue(desktopPageObj.canonIsDisplated());
		logger.info("user should see CanonEOS 5D");
		WebDriverUtility.screenShot();
		driver.navigate().back();
	}

	@When("^User click on HP LP3065$")
	public void user_click_on_HP_LP() throws Throwable {
		desktopPageObj.userClickOnHPLP3065();
	}

	@Then("^User should see HP LP3065$")
	public void user_should_see_HP_LP() throws Throwable {
		Assert.assertTrue(desktopPageObj.HPLP3065IsDisplayed());
		logger.info("user should see hp lp3065");
		WebDriverUtility.screenShot();
		driver.navigate().back();
	}

	@When("^User click on HTC TouchHD$")
	public void user_click_on_HTC_TouchHD() throws Throwable {

		desktopPageObj.userClickOnHTCTouchHD();

	}

	@Then("^User should see HTC TouchHD$")
	public void user_should_see_HTC_TouchHD() throws Throwable {

	Assert.assertTrue(desktopPageObj.htcTouchHDIsDisplated());
	logger.info("user should see HTC Touch HD");
	WebDriverUtility.screenShot();
	driver.navigate().back();
	
	
	}

	@When("^User click on iphone$")
	public void user_click_on_iphone() throws Throwable {

		desktopPageObj.userClickOniphone();
		logger.info("user click on iphon");
		
	}

	@Then("^User should see iphone$")
	public void user_should_see_iphone() throws Throwable {

	Assert.assertTrue(desktopPageObj.iphonIsDisplated());
	logger.info("user should see iphone");
	WebDriverUtility.screenShot();
	driver.navigate().back();
	
	
	
	}

	@When("^User click on ipod Classic$")
	public void user_click_on_ipod_Classic() throws Throwable {
		
		desktopPageObj.userClickOnipodClassic();
		logger.info("user click on ipod Classic");
	
	}

	@Then("^User should see ipod Classic$")
	public void user_should_see_ipod_Classic() throws Throwable {
		
		Assert.assertTrue(desktopPageObj.ipodClassicIsDisplated());
		logger.info("user should see ipod Classic");
		WebDriverUtility.screenShot();
		driver.navigate().back();
	
	
	}

	@When("^User click on MacBook$")
	public void user_click_on_MacBook() throws Throwable {

		desktopPageObj.userClickOnMacBook();
		logger.info("user click on macBook");
	}

	@Then("^User should see MacBook$")
	public void user_should_see_MacBook() throws Throwable {
		
		Assert.assertTrue(desktopPageObj.macBookIsDisplated());
		logger.info("user should see macBook");
		WebDriverUtility.screenShot();
		driver.navigate().back();
	
	}

	@When("^User click on MacBook Air$")
	public void user_click_on_MacBook_Air() throws Throwable {

		desktopPageObj.userClickOnMacBookAir();
		logger.info("user click on MacBook Air");
	
	}

	@Then("^User should see MacBOOK Air$")
	public void user_should_see_MacBOOK_Air() throws Throwable {

	Assert.assertTrue(desktopPageObj.macBookAirIsDisplated());
	logger.info("user should see MacBook Air");
	WebDriverUtility.screenShot();
	driver.navigate().back();
	
	}

	@When("^User click on Palm Treo Pro$")
	public void user_click_on_Palm_Treo_Pro() throws Throwable {

		desktopPageObj.userClickOnPalmTreoPro();
		logger.info("user click on Palm Treo Pro");
	
	}

	@Then("^User should see Palm Treo Pro$")
	public void user_should_see_Palm_Treo_Pro() throws Throwable {

		Assert.assertTrue(desktopPageObj.palmTreoProIsDisplated());
		logger.info("user should see Palm Treo Pro");
		WebDriverUtility.screenShot();
		driver.navigate().back();

	}

	@When("^User click on Product$")
	public void user_click_on_Product() throws Throwable {

		desktopPageObj.userClickOnProduct8();
		logger.info("user click on Product 8");
		
	}

	@Then("^User should see Product$")
	public void user_should_see_Product() throws Throwable {

	Assert.assertTrue(desktopPageObj.product8IsDisplated());
	logger.info("user should see Product 8");
	WebDriverUtility.screenShot();
	driver.navigate().back();
	
	}

	@When("^User click on Samsung SyncMaster$")
	public void user_click_on_Samsung_SyncMaster_BW() throws Throwable {

		desktopPageObj.userClickOnSamsungSyncMaster941BW();
		logger.info("user click on Samsung SyncMaster");
	
	}

	@Then("^User should see Samsung SyncMaster$")
	public void user_should_see_Samsung_SyncMaster() throws Throwable {

		Assert.assertTrue(desktopPageObj.samsungSyncMaster941BWIsDisplated());
		logger.info("user should see Samsung SyncMaster ");
		driver.navigate().back();
	}

	@When("^User click on Sony VAIO$")
	public void user_click_on_Sony_VAIO() throws Throwable {

		desktopPageObj.userClickOnSonyVAIO();
		logger.info("user click on Sony VAIO");
	
	}

	@Then("^User should see Sony VAIO$")
	public void user_should_see_Sony_VAIO() throws Throwable {

		Assert.assertTrue(desktopPageObj.sonyVaioIsDisplated());
		logger.info("user should see Sony");
		WebDriverUtility.screenShot();
		driver.navigate().back();
	
	
	}

//	@Then("^User should see all itmes are prsent in Desktop page$")
//	public void user_should_see_all_itmes_are_prsent_in_Desktop_page() throws Throwable {
//
//		Assert.assertTrue(desktopPageObj.appleCinemaIsDisplayed());
//		logger.info("user shoul see the image");
//	}

}
