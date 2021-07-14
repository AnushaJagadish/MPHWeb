Feature: Test refer a friend positive functionality

  #User must click on the refer a friend and navigated to refer a friend page
  Scenario: Validate that user can able to view Refer a Friend under Home page
    Given launch the URL
    When  Login with valid data
    Then verify Tell your friends about Mpowered Health text and logo is displayed

  Scenario: Validate that user can able to click on Refer a Friend button
    When clicks on Refer a Friend
    Then navigated to Refer a Friend landing page
    And verify referral code text is displayed

  Scenario: Validate Pop Up box when clicked on 'Share a link'
    When clicks on 'Share Link' button
    Then clicks on copy the link
    And verify How it work text is displayed

  Scenario: Validate that user can view the text Invite your friends to Mpowered Health by sharing your unique invitation code
    When verify Invite your friends to Mpowered Health is displayed

  Scenario: Validate that user can able to slide the two grids visible under How its works
    When clicks to slide the gird
    Then navigated to next slide

  Scenario: Validate that user can clicks on the link More information & FAQ and navigated to Frequently asked questions page
    When clicks on the link More information & FAQ
    Then verify list of Frequently asked questions
