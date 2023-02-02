Feature: Deposit Functionality of Digital Bank

  Background:
    And get to the login page
    Given enter a valid username <test1@gmail.com>
    When enter a valid password <TestPass1234>
    And click the sign in button
    And verify the user is on homepage
    Then verify the welcome message is displayed on homepage

  Scenario: Select Deposit Button in SideBar
    Given Deposit Button is Visible on SideBar Under Transactions/Transfers Subsection
    And User Clicks Deposit Button
    Then Verify User is on Deposit Page

  Scenario: User Can Select Account for Deposit and Enters Amount
    Given Verify User is on Deposit Page
    And User Can See Account for Deposit Dropdown and Deposit Amount Fields
    Then User Selects Account for Deposit
    And User Enters Valid(Positive) Amount to Deposit in Selected Account
    And User Clicks Submit

  Scenario: User Can Reset Deposit Information
    Given Verify User is on Deposit Page
    And User Can See Account for Deposit Dropdown and Deposit Amount Fields
    Then User Selects Account for Deposit
    And User Enters Valid(Positive) Amount to Deposit in Selected Account
    But User Clicks Reset to Clear Selections