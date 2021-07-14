Feature: Validation on Home Page

  #User must click on the login and nagivated to home page
  Scenario: Validate navigation to Welcome page
    Given launch the URL
    When Click on 'Welcome Login' button
    Then Verify the Welcome page

  Scenario: Validate Login with valid data
    When enters valid phonenumber and password
    Then click on 'login' button

  Scenario: Validate Home page
    When clicks on all the grid tiles

  Scenario: Validate navigation to the  Refer a friend page on clicking 'Refer a friend' button
    When clicks on the 'Request for second opinion' button
    Then navigated to the Second opinion page

  Scenario: Validate navigation to the Second Opinion page on clicking 'Request for second opinion' button
    When clicks on 'Refer a friend' button
    Then navigated to the Refer a friend page
