Feature: List
  As: The App user
  I want: To see info about Cirrus
  So that

  @List
  Scenario: Cirrus info
    Given I was on home-screen
    When I select list option
    And I select Cirrus
    Then I will see info about Cirrus