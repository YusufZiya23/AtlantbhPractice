@smoke
Feature: Buying a product

  User Story: As a user, I should be able to purchase a product

  Background: On the hooks class at step definitions, Before method allows user to be on the home page

      @PositiveAddToCart @TC05
    #Positive Test Case
    Scenario: Verify user can purchase a product
      When user should click on to the desired product
      And user selects a color, size and quantity
      And user adds product to cart
      And user opens the cart
      Then user buys the product by entering necessary information

      @NegativeAddToCart @TC06
    #Negative Test Case
    Scenario: Verify user can not add a product to cart without selecting options
      When user should click on to the desired product
      And user clicks to add to cart button
      Then user confirms pop up appears with a "Please select some product options before adding this product to your cart." message