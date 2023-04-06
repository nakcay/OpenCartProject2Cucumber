Feature: Add to cart
#  1. Click on 'Add to Cart' button on the product that is displayed in the 'Product Comparison' page (Validate ER-1)
#  2. Click on the 'shopping cart!' link in the displayed success message (Validate ER-2)
  Background:
    Given I navigate to OpenCart web page
    When I go to login page
    And I enter email and password and click login button
  Scenario: Validate adding the product to Cart from 'Product Comparison' Page
    And I send a data to search
    And I click on the search icon
    And I click on the add to cart button under product
    And user should see success message
    And I click on the shopping cart link in the success message
    Then user should see the success message and the product displayed in the shopping cart