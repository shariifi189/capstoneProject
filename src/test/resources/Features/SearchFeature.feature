Feature: test search feature 




Scenario: 
Given User is on Retail website



@02
Scenario Outline: test search 
	Given User is on Retail website 
	When User search for '<itemName>'
	And User click on search button
	
	
	Examples:
	|itemName|
	|iphone|
	|mac book|
	|Canon|
	
