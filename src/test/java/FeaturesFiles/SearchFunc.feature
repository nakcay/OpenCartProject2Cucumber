Feature: (TS_005)
  Search Functionality
#  1. Don't enter anything into the 'Search' text box field
#  2. Click on the button having search icon (Validate ER-1)
  Background:
    Given I navigate to OpenCart web page
    When I go to login page
    And I enter email and password and click login button

  Scenario: (TC_SF_006) Validate all the fields in the Search functionality and Search page have placeholders
    And I click on the search icon
    Then user should see placeholders of the page thar are search text box and criteria text box

  Scenario:(TC_SF_018) Validate Breadcrumb of the 'Search' page
#1. Enter any existing product name into the 'Search' text box field - <Refer Test Data>
#2. Click on the button having search icon
#3. Check whether the Breadcrumb option
    And I send a data to search
    And I click on the search icon
    And I click on the home button
    And I navigate back
    And I click on the search button
    Then user should see the breadcrumb functionality working well
