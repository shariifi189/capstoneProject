Feature: Register Account

@SmokeTest
	Scenario: Registeration 
	Given User is on Retail website
	When User click on My Account
	And User click on Register
	And User fill the Regeration form with below information
	|FirstName|LastName|Email|Telephone|Password|PasswordConfirm|Subscribe|
	|khan|  jan    |jan@yaoo.com|450 505 9844|pass|pass|no|
	And User check the privacy policy 
	And User Click continue button
	Then User should see a system generted massage
	
#//h1[text()='Your Account Has Been Created!']