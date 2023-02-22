Feature: click bell Notifications icon in navigation bar and manage notifications

  Background: User logs in to Digital Bank
    Given user enters valid username and password
    When user clicks on Sign In button
    Then verify user is successfully logged in to their account
@Smoke
    Scenario:
      Given bell icon has shown a badge number indicating that number of notifications exist
      And user clicks bell icon
      And user sees dropdown with titles of individual notifications
      When user clicks a notification
      Then the badge number should decrease by one and user should be taken to a page relevant to the notification