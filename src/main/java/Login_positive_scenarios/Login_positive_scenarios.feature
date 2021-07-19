Feature: Validate login positive functionality

  #TC 001 - Validate that the'Phone number' field is prefixed with '+1' country code*/
  Scenario: Validate that the 'Phone number' field is prefixed with +1 country code
    Given launch the URL
    When clicks on 'Login' button
    Then check  the  'Phone number' field is prefixed with country code

    #TC 002 - Validate that the user is able to click on the 'Forgot password?' link
  Scenario: Validate when clicked on the 'Forgot password?' link
    When clicks on 'Forgot password'
    Then navigated to Forgot password page

  #TC 003 - Validate that the user is able click on the 'Sign up' link
  Scenario: Validate when clicked on the 'Sign up' link
    When clicks on 'Sign up'
    Then navigated to Sign up page

    #TC 004 -  Validate that the user is able to enter  the Password in the Password field
  Scenario: Validate enter the password in the 'Password' field
    When enter the Password

    #TC 005 - Validate that the user is able to Login with valid data
  Scenario: Validate that the user is able to Login
    When enters valid phonenumber and password
    Then clicks on 'login'

    #TC 006 - Validate that the user is navigated to 'Landing page' on clicking the 'Log out' option
  Scenario: Validate that the user is navigated to Landing page on clicking the Log out option
    When clicks on Logout
    Then navigated to Landing page
