Feature: Login

  Scenario: Login 1
    Given I am on home page
    When I search item "garmin"
    Then I see item "garmin" on asearch list