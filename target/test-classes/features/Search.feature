Feature: Search for ATM functionality

  Background: User logs in to Digital Bank
    Given user enters valid username and password
    When user clicks on Sign In button
    Then verify user is successfully logged in to their account
  @Smoke
  Scenario: Verify user can access and use search icon
    Given user has clicked search icon in top navigation bar
    And user has entered a valid zip code to search
    When user clicks Enter
    Then user should see ATM Search Location Results page
  @Smoke
  Scenario: Verify user cannot enter a search with invalid zip code input
    Given user has clicked search icon in top navigation bar
    And user has entered a invalid zip code to search
    When user clicks Enter
    Then user should see error pop-up and close search