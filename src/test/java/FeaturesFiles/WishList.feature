Feature: Wish List
#  1. Click on 'Modify your wish list' option
#  2. Check the Breadcrumb that is displayed in the 'Wish List' page (Validate ER-1)
  Background:
    Given I navigate to OpenCart web page
    When I go to login page
    And I enter email and password and click login button

  Scenario: Validate the Breadcrumb in the 'Wish List' page
    And I click on the wish list button
    Then user see the my wish list on the bread crumb
