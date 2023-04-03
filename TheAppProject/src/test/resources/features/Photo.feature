Feature: Photo
  As: The App user
  I want: To see photos from Vancouver
  So that

  @Photo
  Scenario: Vancouver and mountains
    Given I was on home screen
    When I select photo option
    And I select the first pic
    Then I will see a description of the pic