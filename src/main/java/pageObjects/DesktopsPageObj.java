package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class DesktopsPageObj  extends Base{
	
	public DesktopsPageObj() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//a[@class='dropdown-toggle'])[2]")
	private WebElement  desktops;
	
	@FindBy(xpath="(//a[@class='see-all'])[1]")
	private WebElement showAllDesktops;
	
	@FindBy(xpath="(//img[@class='img-responsive'])[2]")
	private WebElement appleCinema;
	
	@FindBy(xpath = "//img[@title='Canon EOS 5D']")
	private WebElement  canon;
	
	@FindBy(xpath="//img[@title='HP LP3065']")
	private WebElement hplp3065;
	
	@FindBy(xpath ="//img[@title='HTC Touch HD']")
	private WebElement htcTouchHD;
	
	@FindBy(xpath = "//img[@title='iPhone']")
	private WebElement iphone;
	
	@FindBy(xpath ="//img[@title='iPod Classic']")
	private WebElement ipodClassic;
	
	@FindBy(xpath="//img[@title='MacBook']")
	private WebElement macBook;
	
	@FindBy(xpath="//img[@title='MacBook Air']")
	private WebElement macBookAir;
	
	@FindBy(xpath="//img[@title='Palm Treo Pro']")
	private WebElement palmTreoPor;
	
	@FindBy(xpath="//img[@title='Product 8']")
	private WebElement product8;
	
	@FindBy(xpath="//img[@title='Samsung SyncMaster 941BW']")
	private WebElement samsungSyncMaster941BW;
	
	@FindBy(xpath="//img[@title='Sony VAIO']")
	private WebElement sonyVaio;
	
	
	
	
	
	
	public void userClickOnDesktops() {
		WebDriverUtility.clickOnElement(desktops);
	}
	
	
	public void userClickOnShowAllDesktops() {
		WebDriverUtility.clickOnElement(showAllDesktops);
	}
	
	public void userClickOnApplCinema() {
		WebDriverUtility.clickOnElement(appleCinema);
		
	}
	
	public boolean appleCinemaIsDisplayed() {
		if(appleCinema.isDisplayed())
			return true;
			else
				return false;
	}
	
	
	public void userClickOnCanonEOS5D() {
		WebDriverUtility.clickOnElement(canon);
	}
	
	public boolean canonIsDisplated() {
		if(canon.isDisplayed())
			return true;
			else
				return false;
	}
	
	public void userClickOnHPLP3065() {
		WebDriverUtility.clickOnElement(hplp3065);

	}

	public boolean HPLP3065IsDisplayed() {
		if(hplp3065.isDisplayed())
			return true;
			else
				return false;
	}
	
	
	public void userClickOnHTCTouchHD() {
		WebDriverUtility.clickOnElement(htcTouchHD);
		
	}

	public boolean htcTouchHDIsDisplated() {
		if(htcTouchHD.isDisplayed())
			return true;
			else
				return false;
	}
	
	public void userClickOniphone() {
		WebDriverUtility.clickOnElement(iphone);
		
	}

	public boolean iphonIsDisplated() {
		if(iphone.isDisplayed())
			return true;
			else
				return false;
	}
	
	public void userClickOnipodClassic() {
		WebDriverUtility.clickOnElement(ipodClassic);
		
	}
	
	public boolean ipodClassicIsDisplated() {
		if(ipodClassic.isDisplayed())
			return true;
			else
				return false;
	}
	
	public void userClickOnMacBook() {
		WebDriverUtility.clickOnElement(macBook);
		
	}
	
	public boolean macBookIsDisplated() {
		if(macBook.isDisplayed())
			return true;
			else
				return false;
	}
	
	public void userClickOnMacBookAir() {
		WebDriverUtility.clickOnElement(macBookAir);
	}
	
	public boolean macBookAirIsDisplated() {
		if(macBookAir.isDisplayed())
			return true;
			else
				return false;
	}
	
	public void userClickOnPalmTreoPro() {
		WebDriverUtility.clickOnElement(palmTreoPor);
	
	}
	
	
	public boolean palmTreoProIsDisplated() {
		if(palmTreoPor.isDisplayed())
			return true;
			else
				return false;
	}
	
	
	public void userClickOnProduct8() {
		WebDriverUtility.clickOnElement(product8);
	}

	public boolean product8IsDisplated() {
		if(product8.isDisplayed())
			return true;
			else
				return false;
	}
	
	public void userClickOnSamsungSyncMaster941BW() {
		WebDriverUtility.clickOnElement(samsungSyncMaster941BW);
	}
	
	public boolean samsungSyncMaster941BWIsDisplated() {
		if(samsungSyncMaster941BW.isDisplayed())
			return true;
			else
				return false;
	}
	
	public void userClickOnSonyVAIO() {
		WebDriverUtility.clickOnElement(sonyVaio);
	}
	
	public boolean sonyVaioIsDisplated() {
		if(sonyVaio.isDisplayed())
			return true;
			else
				return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	

	
	
	
	

	

}
