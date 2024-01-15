@staging
Feature: Account login

  Scenario Outline: Account login with valid credentials
    Given login page is displayed
    When username entered is "<username>"
    And password entered is "<password>"
    Then home page should be displayed

    Examples: 
      | username | password |
      | valid    | valid    |
      | valid    | invalid  |
      | invalid  | valid    |
      | invalid  | invalid  |
