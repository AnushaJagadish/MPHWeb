Feature: Validation on Landing page

  #User is navigated to Welcome,Login,Sign Up page
  Scenario: Validate navigation to Welcome page
    Given launch the URL
    When navigation to Welcome page

  Scenario: Validate when clicked on 'Login' button and navigate to Login page
    When clicks on the 'Login' button
    Then navigate to Login page

  Scenario: Validate when clicked on 'Sign Up' button and navigate to Sign Up page
    When clicks on  'Sign Up' button
    Then navigate to Sign up page
