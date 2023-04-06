Feature: Login Functionality
#  1. Click on 'My Account' Dropmenu
#  2. Click on 'Login' option
#  3. Enter valid email address into the 'E-Mail Address' field - <Refer Test Data>
#  4. Enter invalid password into the 'Password' field - <Refer Test Data>
#  5. Click on 'Login' button (Validate ER-1)

  Scenario Outline: (TC_04) Validate logging into the Application using valid email address and invalid Password
    Given I navigate to OpenCart web page
    When I go to login page
    And I enter "<email>" and invalid "<password>" and click login button
    Then user should see the Warning message with the text Warning: No match for E-Mail Address and or Password. should be displayed
    Examples:
      | email               | password  |
      | testersdet@test.com | xyzabc123 |

  Scenario: (TC_17) Validate Logging into the Application, closing the Browser without logging out and opening the application in the Browser again
#    1. Click on 'My Account' Dropmenu
#    2. Click on 'Login' option (Validate ER-1)
#    3. Enter valid email address into the 'E-Mail Address' field - <Refer Test Data>
#    4. Enter valid password into the 'Password' field - <Refer Test Data>
#    5. Click on 'Login' button
#    6. Close the Browser
#    7. Open the Browser and open the Application URL (ER-1)
    Given I navigate to OpenCart web page
    When I go to login page
    And I enter email and password and click login button
    And I close the browser
    And I navigate to OpenCart web page again
    Then user should see logged in page again
#      bug alarm