@InitialPage
Feature: Initial Page
  Try to access restricted areas without login

  Background:
    Given The user is the main page

  @invalid
  Scenario: Ask for the password to insert the ad
    When The user clicks on the ad insert link
    Then The system directs the user to login page

  @invalid
  Scenario: Ask for the password to access the chat
    When The user clicks on the link Chat
    Then The system directs the user to login page

  @invalid
  Scenario: Ask for the password to access my account
    When The user clicks on the link My Account
    Then The system directs the user to login page