
@tag
Feature:DB SQL query Feature Scenario 

  @DB
  Scenario: Connecto to DB
    Given User connect to postgreSql DataBase
    When User sends querry 'select * from public.actor'
    Then User should get all the information from that table
    
    
    

  