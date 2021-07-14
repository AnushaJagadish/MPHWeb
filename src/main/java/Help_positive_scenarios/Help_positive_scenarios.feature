Feature: Validation on Help Page

  #User must click on the help and nagivated to Frequently asked questions page
  Scenario: Validate that the Frequently asked questions title  should be present in  Help page
    Given Launch the URL
    When Click on 'Help' tab
    Then verify the  Frequently asked questions title

  Scenario: Validate that the Second Opinions title  should be present  and able to see description
    When Click on Second Opinions title
    Then Verify the Second Opinions description is displayed

  Scenario: Validate that the Award Points title  should be present  and able to see description
    When Click on Award Points title
    Then Verify the Award Points description is displayed

  Scenario: Validate that the Referral title  should be present  and able to see description
    When Click on Referral title
    Then Verify the Referral description is displayed

  Scenario: Validate that the Profile title  should be present  and able to see description
    When Click on Profile title
    Then Verify the Profile description is displayed

  Scenario: Validate that the Payments  title  should be present  and able to see description
    When Click on Payments title
    Then Verify the Payments description is displayed

  Scenario: Validate that the  Add coverage  title  should be present  and able to see description
    When Click on Add coverage  title
    Then Verify the Add coverage description is displayed
