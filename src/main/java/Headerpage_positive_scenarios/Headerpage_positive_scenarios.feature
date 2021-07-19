Feature: Verify header in home page positive functionality

 #TC 001 - Validate that the  'mpowered health’ logo  should be present in the header
Scenario: Validate that the mpowered health logo in the header
Given Launch the browser
 When Navigated to welcome screen
Then  Check the mpowered health logo in the header

 #TC 002 -Validate that the user is navigated to the help page on clicking 'Help' icon
Scenario: Validate the navigation to the help page on clicking Help icon
When Click on Help icon
Then Verify navigation to the help page

 #TC 003 -Validate that the user is navigated to the alerts page on clicking 'Your alerts' icon
Scenario: Validate the navigation to the alerts page on clicking Your alerts icon
When Click on Your alerts icon
Then Verify navigation to the alerts page

 #TC 004 -Validate that user is able to click on the 'Drop down' tab
Scenario: Validate the Drop down tab
When Click on Drop down tab
Then Verify the drop down options

#TC 005 -Validate that the user is navigated to the  profile page on clicking 'Your profile' tab
Scenario: Validate the navigation to the  profile page on clicking  Your profile tab
When Click on Drop down tab
Then Click on  Your profile
 And Verify navigation to the profile page.

#TC 006 -Validate that the user is navigated to the ratings dashboard page on clicking 'Your ratings' tab
Scenario: Validate  the  navigation to the ratings dashboard page on clicking Your ratings tab
When Click on Drop down tab
Then Click on  Your ratings
Then Verify navigation to the ratings dashboard page.

 #TC 007 -Validate that the user is navigated to the 'Feedback Port'   page  on clicking 'Feedback'
Scenario: Validate the navigation to the Feedback Port   page  on clicking Feedback
When Click on Drop down tab
Then Click on  Feedback
Then  Verify the navigation to the Feedback Port.

 #TC 008 -Validate that the user is navigated to the Contact Us   page  on clicking Contact us
Scenario: Validate  the navigation to the Contact Us page  on clicking  Contact us
 When  Click on Drop down tab
Then Click on  Contact Us
 And Verify the navigation to the Contact Us.

 #TC 009 -Validate that the user is able to see Privacy Policy dialogue box on clicking on the 'Privacy Policy'
Scenario:  Validate the  Privacy Policy dialogue box on clicking on the Privacy Policy
 When  Click on Drop down tab
Then Click on  Privacy Policy
Then Verify the dialogue box on privacy page

 #TC 010 - Validate that the user is able to see Terms & Conditions dialogue box on clicking on the 'Terms & Conditions'
Scenario:   Validate  the  Terms & Conditions dialogue box on clicking on the Terms & Conditions
When Click on Drop down tab
Then click on  Terms & Conditions
And Verify the dialogue box on Terms and condition page

#TC 011 -Validate that the user is navigated to the Landing page on clicking 'Log out' icon
 Scenario: Validate the navigation to the Landing page on clicking Log out icon
  When Click on Log out icon
  Then Verify navigation to the Landing  page