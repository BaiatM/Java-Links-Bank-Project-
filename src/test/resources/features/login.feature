Feature: Login feature
   Scenario: Verify user can log in with valid credentials
     Given User enters "valid.username" and "valid.password"
     When User clicks on Sign In button
     Then Verify user successfully logged in into account