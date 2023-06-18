Feature: Add To Card Button Test

  @wip
  Scenario: The user should be add the products and should be use shopping card.
    Given The user is on the login page
    When The user should fill in valid credentials
    And The user should be able to search for any product
    And The user should be go to the page where the relevant products are presented
    Then Verify the relevant product should be displayed
    When The user click the relevant product
    And The user should be see "Add to Cart" and "Buy Now" buttons next to the product
    And The user should be click the "Add to Cart" button
    Then Verify the product is added to the user's shopping card