@registration @sanity 
Feature: trainer registration

  Scenario: to register trainer
    Given the application is running
    When user is valid
    And the type of user should be customer 
    Then register the user
    But should be from india 
