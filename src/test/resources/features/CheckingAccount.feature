Feature: Creating a new checking account
  Background: User is logged in
    Given user enters valid "valid.username" and "valid.password"
    When user clicks on sign in button
    Then verify user is successfully logged in to the account
  @Smoke
  Scenario: User is able to create a new checking account with valid credentials
    Given user is clicking on Checking dropdown and seeing following options: View Checking, New Checking
    And user is opening new tab by clicking on New Checking option
    And user is changing to new checking tab
    And user is able to see all related labels
    When user fills the information for new checking account
    And user clicks on submit button
    Then user should see the confirmation message
  @Smoke
  Scenario: User is able to to reset filled information by clicking reset button
    Given user is clicking on Checking dropdown and seeing following options: View Checking, New Checking
    And user is opening new tab by clicking on New Checking option
    And user is changing to new checking tab
    And user is able to see all related labels
    When user fills the information for new checking account
    And user clicks on reset button
    Then user should see that information was cleared






###PreferredCheckingAccount###
# 1. Display Checking field under BANKING ACCOUNTS section,
# clicking on 'Checking' dropdown should be displayed with following options: View Checking, New Checking
# 2. Clicking on 'New Checking' option, should redirect user to "http://3.131.35.165:8080/bank/account/checking-add"
# ##(Note: Click on 'New Checking' and try to open it in new tab) ------
# 3. Display a header "New Checking Account"
# 4. Display a label "Select Checking Account Type" with the following radio button options:
#   Standard Checking, Interest Checking
#   - All Radio buttons should be unchecked by default
# 5. Display a label "Select Account Ownership" with the following radio button options: Individual, Joint
#   - All Radio buttons should be unchecked by default
# 6. Display an Input filed "Account Name".
# - Accepts alphanumeric and special characters. [^A-Za-z0-9]
# 6. Display an Input filed "Initial Deposit Amount"
# - Minimum opening deposit is $25.00. Accepts numeric whole or decimal values.
# 7. Display 'Submit' button, clicking on it should successfully create an account
#  and user will be redirected to page to view checking account.
# 8. Display 'Reset' button, clicking on it should reset all filled values to default state.


  #1st scenario is to create a new checking account with valid credentials
  #2nd scenario is to check the reset button works fine
