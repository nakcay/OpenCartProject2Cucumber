Feature: Login to the OpenCart web page

  Scenario: Login for the further use
    Given I navigate to OpenCart web page
    Then I go to login page
    And I enter email and password and click login button