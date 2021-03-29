Feature: Product Compare 

@12
Scenario: Compare Product 
	Given User is on Retail website 
	When User click on Laptop & Note Book option 
	And User click on Show all Laptop & Note Book option 
	And User click on product comparison icon on 'Mac Book'
	And User click on product comparison icon on 'Mac Book Air'
	Then User should see a message 'Success: you have added Mac Book Air to your product comparison!'
	And User click on product comparison link
	Then User should see Product Comparison Chart
	
	