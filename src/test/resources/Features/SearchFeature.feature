

Feature: Search Functionality

  @tag1
  Scenario: Seach Funtion
    Given User is on Retail website
    When User search for 'iphone'
    And User click on search button
    Then User should see iphone image

	@tag2
	Scenario Outline: Search Functionality
		Given User is on Retail website
		When User search for '<itemName>'
		And User click on search button
		
		Examples:
		|itemName|
		|iphone|
		|macbook|
		|conon|
		|apple|
		
