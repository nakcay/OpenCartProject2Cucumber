Feature: Forgot Password
#  1. Click on 'Forgotten Password' link from Login page
#  2. Click on 'Back' button  (Validate ER-1)
  Scenario: (TC_FP_019) Validate Back button on the 'Forgotten Password' page
    Given I navigate to OpenCart web page
    When I go to login page
    And I click on forgotten password button
    And navigate back
    Then user should see the login page again

#  1.Click on 'Forgotten Password' link from Login page
#  2. Enter an email address for which the Account doesn't exist in the application
#  3. Click on 'Continue' button
#  1. Success message with text - 'An email with a confirmation link has been sent your email address.' should be displayed in green color