Feature:
#  1. Check the Featured section in the displayed Home page (Validate ER-1 and ER-2)

  Scenario: Validate four featured products should be displayed in the Home Page
    Given I navigate to OpenCart web page
   When I click on the items one by one and navigate back
    And I click on the add to card button of the items one by one and get the success messages
    And I click on the wish list button of the all features items and get the alert messages
    And I click on the compare this item buttons one by one and get success message

