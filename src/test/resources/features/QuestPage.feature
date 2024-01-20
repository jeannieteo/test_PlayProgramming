Feature: HomePage of CodingGames
Background:
    Given I am on the HomePage "https://www.codingame.com/start/"
    When User clicks on "Login" button
    And User enters username as "cloversoftie@gmail.com" and password as "matterHorn2024"
    Then User should be able to login sucessfully


  @MenuCases
  Scenario: Move to Onboarding
    When User clicks on Introduction button
    Then User should be lead to the "onboarding" gamepage
    
  @MenuCases2
  Scenario: Move to SOLO
    When User hovers on "SOLO" and choose "PUZZLES" menu
    Then User should be lead to the "training" gamepage
