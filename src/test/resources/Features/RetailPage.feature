Feature: Retail Website Features

  #Every feature file start with feature : and name of feature file
  #Every scenario start with Scenario : and name of test case that we want to automate
  #Gherkin words are Given When Then
  #Given is a precondition
  #When is an Action taken
  #Then is an expected result (we write validation)
  #And is repeating an action or can be used following Given keyword as well
  #But is used for Negative scenario verification
  Background: 
    # Background is used to run the code every time it runs the Scenario or Scenario outline
    # Every repeated step that happen in Scenario or Scenario outline come under background
  #  Given User is on Retail website

  Scenario: Search functionlity Test case
   # When User search for 'iphone'
  #  And User click on search button
  #  Then User should see Iphone image
    

  # In scenario outline we can run same scenario multiple set of data
  #we will use Examples keyword to pass different data
  #under examplse keyword we placed datat inside the pipes | and we can separate columns
  # with pipes
  # in Examples each row represent one time of execution
  Scenario Outline: Test Search Functionality with multiple set of Data
  #  When User search for '<itemName>'
    #And User click on search butto

  #  Examples: 
 #     | itemName |
  #    | iphone   |
 #     | mac book |
    #  | Conon    |

 # Scenario: Register an Account test case
  #