Feature: macBook




@Sharifi
Scenario: Verify MacBook is present in webpage
	Given User is on Retail website 
	When User search for 'MacBook' 
	And User click on search buttom 
	Then User should see MackBook 
	
	
