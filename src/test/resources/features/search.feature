@smoke
Feature: Searching a product

  User story: As a user, I should be able to search a product so that I can find it

  Background: User is expected to be on the home page since we have a Before method in the Hooks class.
    Given user should see the search button and click it


    @PositiveSearch
    #Positive Test Case
  Scenario: Searching a product with valid credentials
    When user search for "PINK DROP SHOULDER OVERSIZED T SHIRT"
    And user confirms searched product is displayed
    Then user sees related products are displayed

    @NegativeSearch
    #Negative Test Case
  Scenario: Searching a product with invalid credentials
    When user search for "abc"
    And user sees the "No products were found matching your selection." message
    Then user confirms opening time is displayed

    @SearchKeyword
      #Positive Test Case
  Scenario: User searching for a product with a keyword
    When user search for "Pink"
    And user sees filter dropdowns
    Then user confirms shown products have the "PINK" in their text

    @Typo
    #Negative Test Case
  Scenario: User makes a typo in search box
      When user search for "Ponk"
      Then user sees the "No products were found matching your selection." message