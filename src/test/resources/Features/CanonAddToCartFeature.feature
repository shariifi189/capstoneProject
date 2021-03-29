Feature: Add Canon to cart Feature 


@Canon
Scenario: Canon add to cart 

	Given User is on Retail website 
	When User click on Desktops tab 
	And User click on Show All Desktops 
	And User Click Add to Cart option on 'Canon EOS 5D' item 
	And User select color from dropdown 'Red' 
	And User select quantity '1'
	And User click on the cart button
	Then User should see a massgae 'Success: you have added Canon EOS5D to you shopping cart!'