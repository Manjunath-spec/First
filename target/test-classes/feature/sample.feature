Feature: This is to validate the Login functionality

  Scenario Outline: To validate the login functionality with valid credentials
    Given The user in FB
    When The Valid "<username>" and "<password>" has been given
    Then Click the log in button

    Examples: 
      | username  | password |
      | manjunath | bvcbvcb  |