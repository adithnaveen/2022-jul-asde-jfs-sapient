@login @sanity @regression
Feature: this is login feature

  Scenario Outline: 
    Given the application is loaded
    When the user enters username as "<username>"
    And password as "<password>"
    Then validate the user
    And show homescreen

    Examples: 
      | username | password |
      | alok     | secret   |
      | naveen   | naveen   |
      | simar    | simar    |
      | praneet  | testing  |
