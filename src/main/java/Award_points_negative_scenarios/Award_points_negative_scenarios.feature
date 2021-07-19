Feature: Validation on Award Points Page

  #User must click on the Award Point and navigated to the Redeemed award points page
  Scenario: Validate navigation to award points page
    Given Launch the URL
    When Navigate to Welcome screen and validate the welcome page
    Then Click on Utilities tab
    And Click on Award Points

  # TC 001 - Verify the validation message on entering amount more than the available amount in "Redeem Award Points" page
  Scenario: Verify the validation message on entering amount more than the available amount in "Redeem Award Points" page
    When Click on 'redeem' points
    Then Enter the amount more than available amount
    And Validate the message on award points page

  #TC 002 - Validate the validation message on entering amount less than the available amount in "Redeem Award Points" page
  Scenario: Validate the validation message on entering amount less than the available amount in "Redeem Award Points" page
    When Enter the amount less than the available amount
    Then Validate the message on award points page on less amount

  #TC 003 -  Validate that user is not able to click on the 'Redeem' button on leaving the field 'Select a gift card' blank"
  Scenario: Unable to click on the 'Redeem' button on leaving the field 'Select a gift card' blank"
    When Click the Redeem button on leaving the field Select a gift card blank
    Then Validate the error message displayed

    #TC 004 -  Validate that user is not able to click on the 'Redeem' button on leaving the field 'Enter Amount' blank on "Redeem Award Points" page
  Scenario: Unable to click on the 'Redeem' button on leaving the field 'Enter Amount' blank on "Redeem Award Points" page
    When Click on the Redeem button on leaving the field Enter Amount blank
    Then Validate the message displayed
