Feature: MackBook 



@AddMac
Scenario: Add and Remove MacBookt to the cart
Given User is on Retail website
When User click on Latop&NoteBooktab
And User click on Show all Laptop and NoteBookOption
And User click on clickadd to Cart button
Then User should see a message 'Success: You have add MacBook to your shopping cart!'
And User shold see '1item(s)-602.00'showed to the cart
And User click on cart option
And User Click on the red X button to remove the item from car
Then item should be removed and cartshould show '0 item(S)'
