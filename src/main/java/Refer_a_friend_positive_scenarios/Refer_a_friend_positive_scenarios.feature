Feature: Test refer a friend positive functionality

#TC 001 - Validate that user must be able to view Refer a Friend under Home page
  Scenario: Validate that user can able to view Refer a Friend under Home page
    Given launch the URL
    When  Login with valid data
    Then verify Tell your friends about Mpowered Health text and logo is displayed

    #TC 002 - Validate that user must be able to click on Refer a Friend button displayed in the home page
  Scenario: Validate that user can able to click on Refer a Friend button
    When clicks on Refer a Friend
    Then navigated to Refer a Friend landing page
    And verify referral code text is displayed

    #TC 003 - Validate that the user should able to see a Pop Up box when clicking on Share a link
  Scenario: Validate Pop Up box when clicked on 'Share a link'
    When clicks on 'Share Link' button
    Then clicks on copy the link
    And verify How it work text is displayed

    #TC 004 - Validate that user can view the text Invite your friends to Mpowered Health by sharing your unique invitation code
  Scenario: Validate that user can view the text Invite your friends to Mpowered Health by sharing your unique invitation code
    When verify Invite your friends to Mpowered Health is displayed

    #TC 005 - Validate that user can able to slide the two grids visible under How its works
  Scenario: Validate that user can able to slide the two grids visible under How its works
    When clicks to slide the gird
    Then navigated to next slide

    #TC 006 -Validate that user can able to click on the link More information & FAQ and it will navigated to Frequently asked questions page
  Scenario: Validate that user can clicks on the link More information & FAQ and navigated to Frequently asked questions page
    When clicks on the link More information & FAQ
    Then verify list of Frequently asked questions
