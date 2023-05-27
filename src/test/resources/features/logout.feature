@smoke
Feature: User logging out from an account

  User Story: As a user I should log out so that I can see the login page.

  Background: On the hooks class at step definitions, Before method allows user to be on the home page
    Given user already logged in to an account with email "yusufziyagunes1@gmail.com" and password "yusufziya"

      @LogOut
    Scenario: user logs out
      When user should see the "my-account" on url
      And user sees two log out buttons
      Then user clicks to any log out button