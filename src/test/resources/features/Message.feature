Feature: Click message/email icon and manage messages

  Background: User logs in to Digital Bank
    Given user enters valid username and password
    When user clicks on Sign In button
    Then verify user is successfully logged in to their account
  @Smoke
  Scenario:
    Given user has clicked message-email navigation bar icon
    And has seen the number of messages in the icon's badge
    Then user should see on-screen message confirming the number of Unread Messages matches badge number