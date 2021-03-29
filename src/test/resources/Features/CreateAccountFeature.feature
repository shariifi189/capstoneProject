Feature: Create an account 

@CreateAccount
Scenario: User should be able to register online 
	Given User is on Retail website 
	When User click on My Account
	And User click on Register
	And User fill the below information 
	|firstName|lastName|email|telephone|password|passwordConfirm|subscribe|
	|jack|jason|jack@gimail.com|5405985858|Password|Password|no|
	And User click on PrivacyPolicy check box
	And User click on Continue button
	Then User should see a welcome massage
	