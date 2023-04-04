Feature: Echo Box
  As: The App user
  I want: To read what I wrote
  So that

  Background: To be at home screen
    Given I was on the home screen

  @Echo
  Scenario Outline: See the written text
    When I select Echo Box option
    And I type '<text>'
    Then I will see the same text '<same>'
    Examples:
      | text | same |
      | a    | a    |
      | 1    | 1    |
      | *    | *    |