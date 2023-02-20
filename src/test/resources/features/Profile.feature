Feature: Verify accounts buttons

  @Smoke
  Scenario Outline: Verify user is able to login with valid credentials
    Given user enters valid username and password
    When user clicks on Sign In button
    When user clicks on account button
    Then user can see "<buttons>"
    Examples:
      | buttons         |
      | My Profile      |
      | Change Password |
      | Logout          |
















































