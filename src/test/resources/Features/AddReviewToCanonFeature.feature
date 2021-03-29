Feature: Add a Review to Canon 


@AddReviewToCanon
Scenario: Add a review to Canon EOS 5D item in Desktopstab 
	Given User is on Retail website 
	When User click on Desktops tab 
	And User click on Show all desktops 
	And User click on Canon EOS 5D item
	And User click on write  a review link 
	And User fill the review information with bellow information 
		|yourName  |yourReview                               |rating|
		|Jack Jason|like the product would recomend to anyone|  good|
	And User click on Continue Button
	Then User should see a message with 'Thank you for your review it has been submitted to the webmaster for approval.'	
	
		
