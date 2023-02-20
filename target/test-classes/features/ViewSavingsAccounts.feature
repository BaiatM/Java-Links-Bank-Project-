Feature: View All Savings Accounts

  Background: User logs in to Digital Bank
    Given user enters valid username and password
    When user clicks on Sign In button
    Then verify user is successfully logged in to their account

  @Smoke
  Scenario: Verify user can view all savings accounts
    Given user clicks Savings on left sidebar
    And user clicks View Savings option
    Then user sees all Savings accounts that exist