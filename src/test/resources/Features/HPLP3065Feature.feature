Feature: Adding HP to Cart 

@AddHPtoTheCart
Scenario: Testing Adding To Cart Feature 

	Given User is on Retail website 
	When User click on Desktops tab 
	And User click on Show all Desktops 
	And User click ADD TO CART option on HP LP item 
	And User select quanitity 1 
	And User click add to Cart button 
	Then User should see a massage 'Success: you have added HP LP 3065 to your Shopping cart!' 
