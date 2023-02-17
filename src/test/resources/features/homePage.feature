Feature: Home Page buttons

  Scenario Outline: Verify user can see the Home Page buttons
    Given User enters valid username and password
    When User clicks on Sign In button
    Then User see the "<buttons>"
    Examples:
      | buttons                   |
      | Home                      |
      | Checking                  |
      | Savings                   |
      | External                  |
      | Deposit                   |
      | Withdraw                  |
      | Transfer Between Accounts |
      | VISA Direct Transfer      |

  Scenario Outline: Verify user can see Checking dropdown features
    Given User enters valid username and password
    When User clicks Sign In button
    Then User clicks on Checking dropdown
    Then User see the "<options>"
    Examples:
      | options       |
      | View Checking |
      | New Checking  |