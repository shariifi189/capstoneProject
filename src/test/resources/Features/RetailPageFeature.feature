Feature: Retail Page Feature

#for this feature you have to have an existing accountBackground


  @tag1
  Scenario: Retail Page Feature
    Given User is on Retail website
    And User click on MyAccount
    When User click on Login
    And User enter username 'userName' and password 'password'
    And User click on Login button
    Then User should be logged in to MyAccount dashboard
    

  