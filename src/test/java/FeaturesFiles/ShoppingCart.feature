Feature: Shopping Cart
#  1. Enter any existing Product name into the Search text box field - <Refer Test Data>
#  2. Click on the button having search icon
#  3. Click on 'Add to Cart' button on the Product displayed in the Search results
#  4. Click on 'Site Map' footer option
#  5. Click on 'Shopping Cart' link in the displayed 'Site Map' page
  Background:
    Given I navigate to OpenCart web page
    When I go to login page
    And I enter email and password and click login button

  Scenario: (TC_SC_003)Validate navigating to 'Shopping Cart' page from the 'Site Map' footer page
    And I send a data to search
    And I click on the search icon
    And I click on the add to cart button product displayed in the result
    And I click on the site map footer option
    And I click on shopping cart link in the displayed site map
#   bug alarm on this step

#  1. Enter any existing Product name into the Search text box field - <Refer Test Data>
#  2. Click on the button having search icon
#  3. Click on the Product displayed in the Search results
#  4. Click on 'Add to Cart' button in the displayed 'Product Display' page
#  5. Click on the 'shopping cart!' link in the displayed success message
#  6. Click on 'Use Coupon Code' section
#  7. Enter any valid Coupon code which already got expired into the 'Enter your coupon here' text field
#  8. Click on 'Apply Coupon' button (Validate ER-1)
  Scenario: (TC_SC_015)Validate Coupon code functionality in the 'Shopping Cart' page by providing an valid coupon code which got expired
    And I send a data to search
    And I click on the search icon
    And I click on the item which is displayed
    And I click on the add to cart button on iMac displayed page
    And I click on the shopping cart
    And I click on the use your coupon menu
    And I send a coupon name
    And I apply the coupon
    Then user should see warning message of invalid coupon
#    1. Enter any existing Product name into the Search text box field - <Refer Test Data>
#    2. Click on the button having search icon
#    3. Click on the Product displayed in the Search results
#    4. Click on 'Add to Cart' button in the displayed 'Product Display' page
#    5. Click on the 'shopping cart!' link in the displayed success message
#    6. Click on 'Use Gift Cerrtificate' section
#    7. Enter any Gift Certificate which is already used up into the 'Enter your gift certificate code here' text field
#    8. Click on 'Apply Gift Certificate' button (Validate ER-1)
  Scenario: (TC_SC_027) Validate Gift Certificate functionality in the 'Shopping Cart' page by providing a used up Gift Certificate
    And I send a data to search
    And I click on the search icon
    And I click on the item which is displayed
    And I click on the add to cart button on iMac displayed page
    And I click on the shopping cart link in the success message
Scenario: (TC_SC_028) Validate Gift Certificate functionality in the 'Shopping Cart' page by not providing any Gift Certificate
#1. Enter any existing Product name into the Search text box field - <Refer Test Data>
#2. Click on the button having search icon
#3. Click on the Product displayed in the Search results
#4. Click on 'Add to Cart' button in the displayed 'Product Display' page
#5. Click on the 'shopping cart!' link in the displayed success message
#6. Click on 'Use Gift Cerrtificate' section
#7. Don't enter any Gift Certificate into the 'Enter your gift certificate code here' text field
#8. Click on 'Apply Gift Certificate' button (Validate ER-1)
  Given I send a data to search
  And I click on the search icon
  And I click on the item which is displayed
  And I click on the add to cart button on iMac displayed page
  And I click on the shopping cart link in the success message
  And I click on the use your gift certification
  And I click on apply gift certificate button
  Then user should see the warning message
