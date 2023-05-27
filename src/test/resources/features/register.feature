@smoke
Feature: Registering an account

  Background: On the hooks class at step definitions, Before method allows user to be on the home page
      Given user clicks to my account button

      @Register
    Scenario: Verify user can register an account
      When user enters a username
      And user enters an email
      And user enter a password
      And user clicks register button
      Then verify user sees a dashboard