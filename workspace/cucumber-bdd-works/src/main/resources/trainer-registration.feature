@registration @sanity 
Feature: trainer registration

  Scenario: to register trainer
    Given the application is running
    When user is valid
    Then register the user
