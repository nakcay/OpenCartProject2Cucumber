Feature: Checkout
#  1. Enter any existing Product name into the Search text box field - <Refer Test Data>
#  2. Click on the button having search icon
#  3. Click on 'Add to Cart' button on the Product displayed in the Search results
#  4. Click on the 'shopping cart!' link in the displayed success message
#  5. Click on 'Checkout' button in the 'Shopping Cart' page
#  6. Select 'I want to use a new address' radio option
#  7. Check all the text fields - First Name, Last Name, Company, Address1, Address 2, City and Post Code for Placeholder text (Validate ER-1)

  Scenario:(TC_CO_008) Validate text fields in Billing Details of the Checkout page has Placeholders
    Given I navigate to OpenCart web page
    When I go to login page
    And I enter email and password and click login button
    And I send a data to search
    And I click on the search icon
    And I click on the add to cart button product displayed in the result
    And I click on the shopping cart link in the success message
    And I click on the checkout button in the shopping cart page
    And I select i want to use a new address option
    Then user should see all the text field Placeholder fields
#bug alarm

#  1. Check the 'Checkout' functionality in all the supported environments (Validate ER-1)
  Scenario: (TC_CO_020) Validate the 'Checkout' functionality in all the supported environments
  Given I navigate to OpenCart web page with chrome browser
    When I click on the checkout button and verify it on the chrome
    And I navigate to OpenCart web page with firefox browser
    And I click on the checkout button and verify it on the firefox
     And I navigate to OpenCart web page with safari browser
    And I click on the checkout button and verify it on the safari
    And I navigate to OpenCart web page with firefox browser
    And I click on the checkout button and verify it on the firefox