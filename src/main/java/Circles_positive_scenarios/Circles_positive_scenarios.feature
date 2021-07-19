Feature: Test Circle positive functionality

  #TC 001 - Validate that a user is taken to the Circles page when they click on the Circles tab
  Scenario: Validate the navigation to the Circles page
    Given Launch the URL
    When Click on the Circles tab
    Then Validate Circles page

    #TC 002 - Validate that a user is able to click on Add a Partner and options pop up
  Scenario: Validate able to click on Add a Partner and options pop up
    When Click on Add a Partner
    Then Validate options pop up

  #TC 003 - Validate that when a user clicks on Add a Provider option under Add a Partner drop-down, they are directed to the provider screen
  Scenario: Validate clicks on Add a Provider option under Add a Partner drop-down
    When Click on Add a Partner link
    Then Click on Select a partner
    And select the My Medicare option finally click on Proceed

    #TC 004 - Validate that the user is able to click on the 'Forgot username?' link
  Scenario: Validate Forgot username? link
    When click on the Forgot username? link
    Then Validate forgot username

  #TC 005 - Validate that the user is able to click on the 'Forgot password?' link
  Scenario: Validate Forgot password? link
    When Click on the Forgot password link
    Then Validate the forgot password

    #TC 006 - Validate that the user is able to enter  the Username and Password in the 'USERNAME' and 'PASSWORD' field
  Scenario: Validate USERNAME and PASSWORD field
    When Enter  the Username and Password
    Then Validate the username and password

    #TC 007 Validate that the password should be displayed on clicking the eye
  Scenario: Validate that the password displayed on clicking the eye
    When Click on eye symbol
    Then View password on clicking the eye

#TC 008 Validate that the user is able to Login with valid data
  Scenario: Validate Login with valid data
    When Enter valid username and password
    Then Validate Login with valid data

    #TC 009 - Validate that the user can able to view 'My Medicare’ icon in the Circles page and also it should be clickable
  Scenario: My Medicare icon in the Circles page and also it should be clickable
    When Navigate to Circles page
    Then My Medicare logo should be present
    And Validate that its clickable
