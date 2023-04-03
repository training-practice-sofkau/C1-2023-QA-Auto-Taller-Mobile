Feature: Login
  As: The App user
  I want: To log in as Alice
  So that

  @Login
  Scenario: Log in to The App
    Given I was on the home-screen
    When I select login option
    And I enter the credentials
    Then I will see a logged in message