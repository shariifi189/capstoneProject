Feature: Desktop tab 


@VerifyAllItemsArePresentInDesktopTab
Scenario: Verify all items are present in Desktops tab 
	Given User is on Retail website 
	When User click on desktops tab 
	And User click on Show all desktops 
	And User click on apple cinema 
	Then User should see apple cinema
	When User click on canon EOS 5D
	Then User should see canon EOS 5D
	When User click on HP LP3065
	Then User should see HP LP3065
	When User click on HTC TouchHD
	Then User should see HTC TouchHD
	When User click on iphone
	Then User should see iphone
	When User click on ipod Classic
	Then User should see ipod Classic
	When User click on MacBook
	Then User should see MacBook
	When User click on MacBook Air
	Then User should see MacBOOK Air
	When User click on Palm Treo Pro
	Then User should see Palm Treo Pro
	When User click on Product 
	Then User should see Product 
	When User click on Samsung SyncMaster 
	Then User should see Samsung SyncMaster
	When User click on Sony VAIO
	Then User should see Sony VAIO
	
	
	
	
	
	#Then User should see all itmes are prsent in Desktop page 
