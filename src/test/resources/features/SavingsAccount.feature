Feature: Creating a new savings account
  Background: User is logged in
    Given user enters valid "valid.username" and "valid.password"
    When user clicks on Sign In button
    Then verify user is successfully logged in to the account
  @Smoke
  Scenario: Verify User is Able to Create a New Savings Account
    When user clicks on Savings option in left sidebar
    And user clicks on New Savings option under Savings option
    And verify user is in Create Savings view
    And user is able to see all savings related labels
    When user selects Savings Account type
    And user selects Account Ownership
    And user enters Account Name
    And user enters Initial Deposit amount
    And user clicks Submit button
    And verify user sees View Savings view and the newly created Savings account with On Off button set to On
    When user clicks View Savings option under Savings option
    Then verify new savings account exists
  @Smoke
  Scenario: User is able to to reset new savings account information by clicking reset button
    When user clicks on Savings option in left sidebar
    And user clicks on New Savings option under Savings option
    And verify user is in Create Savings view
    And user is able to see all savings related labels
    When user selects Savings Account type
    And user selects Account Ownership
    And user enters Account Name
    And user enters Initial Deposit amount
    And user clicks Reset button
    Then verify create new savings account page is reset