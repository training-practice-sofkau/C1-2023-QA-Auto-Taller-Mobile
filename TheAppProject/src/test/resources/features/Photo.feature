Feature: Photo
  As: The App user
  I want: To see a photo of beautiful landscape
  So that

  @Photo
  Scenario: Beautiful photo
    Given I was on home screen
    When I select photo option
    And I select the first pic
    Then I will see a description of the pic