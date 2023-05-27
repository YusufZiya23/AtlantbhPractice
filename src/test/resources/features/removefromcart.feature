@smoke
Feature: Removing a product from cart

  User Story: As a user I should be able to remove a product so that I don't have to buy it

  Background: On the hooks class at step definitions, Before method allows user to be on the home page
    Given user adds a product to cart

    @RemoveProduct @TC08
    Scenario: Verify user removes a product from cart
      When user adds another product to cart
      And user opens the cart
      And user removes any product by clicking x button
      Then user confirms removal message "“black lux graphic t-shirt” removed. Undo?" is displayed

    @EmptyCart @TC09
    Scenario: Verify user clears the cart
      When user removes a product
      And user sees "Your cart is currently empty." message
      Then user sees return to shop button and click it