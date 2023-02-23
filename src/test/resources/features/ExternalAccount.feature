Feature: Linking an external account

  Background: User is logged in
    Given user enters valid "valid.username" and "valid.password"
    When user clicks on Sign In button
    Then verify user is successfully logged in to the account

  Scenario: User is able to link an external account to a Digital Bank account
    Given user has clicked on External option in left sidebar
    And has selected Link External Account option
    And has confirmed Link External Account page
    And has selected an Open Banking Provider
    When user re-enters valid "valid.username" and "valid.password"
    And user clicks on submit button on Link External Account page
    Then user sees new page confirming linked accounts

  Scenario: User is unable to link an external account to a Digital Bank account because no open banking providers are available
    Given user has clicked on External option in left sidebar
    And has selected Link External Account option
    And has confirmed Link External Account page
    When user sees error message
    And user clicks Open Banking Provider
    Then user sees no Open Banking Provider Options are available

  Scenario: User is unable to link an external account to a Digital Bank account clicking submit button
    Given user has clicked on External option in left sidebar
    And has selected Link External Account option
    And has confirmed Link External Account page
    When user re-enters valid "valid.username" and "valid.password"
    And user clicks on submit button on Link External Account page
    Then user sees an error pop-up and no page change

  Scenario: User clears Link External Account information clicking reset button
    Given user has clicked on External option in left sidebar
    And has selected Link External Account option
    And has confirmed Link External Account page
    When user re-enters valid "valid.username" and "valid.password"
    And user clicks on reset button on Link External Account page
    Then user verifies empty username and password fields

    Scenario: User clicks View External Accounts and sees Alert pop-up saying that there are no such accounts
      Given user has clicked on External option in left sidebar
      And has selected View External Accounts
      When user sees pop-up alert there are no External Accounts
      And clicks OK on pop-up
      Then user should be taken to Link External Account page



