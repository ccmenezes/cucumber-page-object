@ForgotMyPassword
Feature: Forgot my password
  Test possible valid and invalid scenarios

  Background:
    Given The user is on RecoveryPassword Page

  @valid
  Scenario: Send password reminder
    When The user types the email "tata@tata.com"
    And  The user clicks on Send button
    Then The system shows the success message

  @invalid
  Scenario: Try to send password reminder without email
    When The user clicks on Send button
    Then The system shows the error message

  @invalid
  Scenario: Try to send password reminder with invalid email format
    When The user types the email "claudia@claudia"
    And  The user clicks on Send button
    Then The system shows the error message

  @invalid
  Scenario: Try to send password reminder without email registered
    When The user types the email "claudiaemailtest@test.com"
    And  The user clicks on Send button
    Then The system shows the error message