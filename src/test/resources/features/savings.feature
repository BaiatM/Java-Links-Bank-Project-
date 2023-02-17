Feature: Savings dropdown feature

  Background:
    Given User enters "valid.username" and "valid.password"
    When User clicks on Sign In button
    Then User clicks on Savings dropdown

  Scenario: User creates a saving account

    Then User clicks on New Savings button
    And User is redirected to new page and sees Create Savings header
    And User selects the saving account type
    And User selects the account ownership type
    And User enters account name "valid.savName"
    And User enters initial deposit "valid.savDep"
    And User clicks the Savings Submit button

  Scenario: User checks the elements under View Savings Page

    Then User clicks on View Savings button
    And User is redirected to new page and sees View Savings Accounts header
    And User checks the elements of account matches the entered values during submission of "Practice0011"
    And User clicks on OnOff toggle of the current account
    And User verifies the elements of transaction table
