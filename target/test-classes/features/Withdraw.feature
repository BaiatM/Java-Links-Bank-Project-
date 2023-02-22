Feature: Withdraw from accounts

  Background: User is logged in
    Given user enters valid "valid.username" and "valid.password"
    When user clicks on Sign In button
    Then verify user is successfully logged in to the account
@Smoke
  Scenario Outline: User is able to withdraw from any account
    Given user clicked on Withdraw option
    And user is redirected to withdraw page
    When user selects "<accountValue>" account
    And user should see available balance
    And user provides "<withdrawAmount>" and clicks submit button
    And user is redirected to view checking accounts
    And user scrolls down until the transaction table is visible
    Then user verifies "<withdrawAmount>" and new balance
    Examples:
      | accountValue | withdrawAmount |
      | 1143         | 12.00          |
      | 1146         | 20.53          |
      | 1882         | 30.67          |
      | 3485         | 15.98          |


