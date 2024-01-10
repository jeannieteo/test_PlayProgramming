
Feature: HomePage of CodingGames

@LoginPositiveCases
  Scenario: Login with valid credentials
    Given I am on the HomePage "https://www.codingame.com/start/"
    When User clicks on "Login" button
    And User enters username as "cloversoftie@gmail.com" and password as "matterHorn2024"
    Then User should be able to login sucessfully

@LoginNegativeCases
  Scenario Outline: Login with invalid credentials
    Given I am on the HomePage "https://www.codingame.com/start/"
    When User clicks on "Login" button
    And User enters username as "<username>" and password as "<password>"
    Then User should be able to see error message"<errorMessage>"

    Examples: 
      | username                  | password        | errorMessage                                                                                                                                   |
      | cloversoftie@gmail.com    | wrongpassword55 | The password you entered is incorrect                                                                                                       |
      | cloversoftie333@gmail.com | matterHorn2024  | This email address is not linked to a CodinGame account.If you're looking for a recruiter account, please try to log in from CoderPad Screen|