@smoke
Feature: Registering and logging in to an account

  Background: On the hooks class at step definitions, Before method allows user to be on the home page
    Given user clicks to my account button

      #Log in with valid credentials
      @loginValid
    Scenario Outline: Verify user log in with VALID credentials
      Given user enter email "<email>"
      When user enter password "<password>"
      And  user clicks on log in button
      Then user should see the "my-account" on url
      Examples:
        | email                     | password  |
        | yusufziyagunes1@gmail.com | yusufziya |

        #Log in with invalid credentials
      @loginInvalid
    Scenario Outline: Verify user can not log in with INVALID credentials
        When user enter email "<email>"
        And user enter password "<password>"
        And  user clicks on log in button
        Then user should see a "ERROR: The username or password you entered is incorrect. Lost your password?" message
        Examples:
          | email    | password    |
          | yuasdsdf | asdfadsfadf |

        #InValid credential
      @emptyPassword
    Scenario Outline: Verify user can not log in with BLANK PASSWORD credentials
        When user enter email "<email>"
        And  user clicks on log in button
        Then user should see the "Error: The password field is empty." message
        Examples:
          | email                     |
          | yusufziyagunes1@gmail.com |