Feature:Logout Functionality
#  1. Click on 'My Account' Dropmenu
#  2. Select 'Regiser' option (Verify ER-1)
  Scenario: (TC_LG_006) Validate Logout option is not displayed under 'Right Column' options before logging in
    Given I navigate to OpenCart web page
   When Click on my Account button
    And Click on Register Button
    Then user should not see logged out button on the right column