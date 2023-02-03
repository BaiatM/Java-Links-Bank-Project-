Feature: Transfer Between Accounts Functionality of Digital Bank

  Background:
    And get to the login page
    Given enter a valid username <test1@gmail.com>
    When enter a valid password <TestPass1234>
    And click the sign in button
    And verify the user is on homepage
    Then verify the welcome message is displayed on homepage

