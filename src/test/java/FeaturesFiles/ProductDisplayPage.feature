Feature: Product Display Page
#  1. Enter any existing Product name into the Search text box field - <Refer Test Data>
#  2. Click on the button having search icon
#  3. Click on the Product displayed in the Search results
#  4. Click on the Description tab of the Product in the displayed 'Product Display' page (Validate ER-1)
  Background:
    Given I navigate to OpenCart web page
    When I go to login page
    And I enter email and password and click login button

  Scenario: (TC_PDP_008)Validate the description of the Product in the Product Display Page
    And I send a data to search
    And I click on the search icon
    And I click on the item which is displayed
    And I click on the description tab
    Then user should see the description is correct

#  1. Enter any existing Product name into the Search text box field  - <Refer Test Data>
#  2. Click on the button having search icon
#  3. Click on the Product displayed in the Search results
#  4. Click on 'Compare this Product' option in the displayed 'Product Display' page (Validate ER-1)
#  5. Click on 'product comparison' link in the success message (Validate ER-2)
  Scenario: (TC_PDP_020)Validate adding the product for comparison from the Product Display page
    And I send a data to search
    And I click on the search icon
    And I click on the item which is displayed
    And I click on the compare this product
    And user should see the product added success message
    And I click on product comparison link in the success message
    Then user should see the product details on the product comparison page
#  1. Enter any existing Product name into the Search text box field  - <Refer Test Data>
#  2. Click on the button having search icon
#  3. Click on the Product displayed in the Search results
#  4. Check the original price of the Product without offer in the displayed 'Product Display' page (Validate ER-1)
  Scenario: (TC_PDP_032)Validate the original price of the Product without offer in the Product Display page
    And I send a apple item data  to search
    And I click on the search icon
    And I click on the product Apple cinema
    And user should see the Product original price


