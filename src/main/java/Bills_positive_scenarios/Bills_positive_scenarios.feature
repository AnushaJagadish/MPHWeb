Feature: Validation on Bills page

  #User must click on the Bills and navigated to the Bills page
  Scenario: Validate navigation to bills page
     Given Launch the URL
    When Click on 'Bills'
    Then Verify navigation to bills page

    #TC 001 - Verify the scenario to view Total bills due
  Scenario: Verify the scenario to view Total bills due
    When 'Total bills due' visible on the page
    And 'Amount' visible on the page

    #TC 002 - Validate by selecting Newest option from the dropdown
  Scenario: Validate by selecting Newest option from the dropdown
    When Click on dropdown
    Then Select 'Newest'

  #TC 003 - Validate view bills as two sections
  Scenario: Validate view bills as two sections
    When Click on 'Due' section
    And Click on 'Paid' section

    #TC 004 - Validate slide the grid below the Bills page title.
  Scenario: Validate slide the grid below the Bills page title.
    When Slide through 'Total bills due'
    Then Validate  'Your expenses' grid is visible

    #TC 005 - Validate 'Pay a Bill' button
  Scenario: Validate 'Pay a Bill' button
    When Click on 'Pay a Bill' button
    Then Validate navigation to bill due section

    #TC 006 - Validate Explore Services button
  Scenario: Validate Explore Services button
    When Click on 'Explore Services' button
    Then Validate navigation to Services dashboard

    #TC 007 - Validate that the user will get validation message when expense is $0
  Scenario: Validate the message when expense is $0
    When Shows validation message 'you have no expenditures yet'
