Feature: Preferred Checking Account

  Background:
    Given User enters "valid.username" and "valid.password"
    When User clicks on Sign In button
    Then Verify user successfully logged in into account
    Then User clicks on Checking dropdown

  Scenario: Verify user can see the options of the Banking Account section

    And User checks the options are displayed

  Scenario Outline: Verify options of New Checking Account

    And User clicks on New Checking Account
    And Verify user is on a new page
    And User selects the checking account type "<checking account type>"
    And User selects the checking account ownership "<checking account ownership>"
    And User enters checking account name "<checking account name>"
    And User enters checking initial deposit "<checking initial deposit amount>"
    And User clicks Reset button
    And User verifies all the fields are empty
    Examples:
      | checking account type | checking account ownership | checking account name | checking initial deposit amount |
      | Standard Checking     | Individual                 | name                  | 25                              |
      | Standard Checking     | Joint                      | name123               | 25.0                            |
      | Interest Checking     | Individual                 | 12345566              | 25.001                          |
      | Interest Checking     | Joint                      | $#%^&&*               | 25.9999                         |


    Scenario Outline: Verify user can create a New Checking Account

      And User clicks on New Checking Account
      And Verify user is on a new page
      And User selects the checking account type "<checking account type>"
      And User selects the checking account ownership "<checking account ownership>"
      And User enters checking account name "<checking account name>"
      And User enters checking initial deposit "<checking initial deposit amount>"
      And User clicks on Submit button
      And Verify user is on a View Checking Page
      Examples:
        | checking account type | checking account ownership | checking account name | checking initial deposit amount |
        | Standard Checking     | Individual                 | name                  | 25                              |
        | Standard Checking     | Joint                      | name123               | 25.0                            |
        | Interest Checking     | Individual                 | 12345566              | 25.001                          |
        | Interest Checking     | Joint                      | $#%^&&*               | 25.9999                         |