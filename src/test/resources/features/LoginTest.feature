Feature: Login Functionality

  Background: User is on the HomePage

  #@Positive
  Scenario: User should be able to login with valid Credentials
    When User clicks on Accept Cookies
    When  User clicks on Login Link
    And   User enters valid Username "avinashp22@gmail.com"
    And   User enters valid Password "Prime123!"
    And   User clicks on Login Button
    Then  User should see Deposit link at the top
    And   User clicks on My Account Button
    Then  User should see the Logout Button
    Then  User clicks the Logout Button

  #@Negative
  Scenario: User should not be able to login with invalid Credentials
    When User clicks on Accept Cookies
    When  User clicks on Login Link
    And   User enters Invalid Username "avinashp33@gmail.com"
    And   User enters Invalid Password "Prime12345!"
    And   User clicks on Login Button
    Then  User should see error message for invalid Username and Password