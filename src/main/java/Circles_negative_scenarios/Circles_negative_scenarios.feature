Feature: Test Circle negative functionality

	#TC 001 - Validate that Proceed button is disabled when they do not select a provider from the drop down
  Scenario: Validate that Proceed button is disabled and do not select a provider from the drop down
    Given Launch the browser
    When  Drop down list is clicked and No selection is made
    Then Proceed to next page

   #TC 002 - Validate that the user is not allowed to login when Username and Password fields are blank
    Scenario: Validate login when Username and Password fields are blank
    	When Enter Username and password blank
		Then Validate the error message on text fields

  #TC 003 - Validate that the user should get a validation message on entering invalid Username  and Password in the Login Page
    Scenario: Validate invalid Username  and Password in the Login Page
    	When Enter incorrect Username and Password
		Then verify error message for incorrect username and password

 #TC 004 - Validate that the user is not allowed leaves blank Username field
	Scenario: Validate when Username field is blank
		When Enter Username field as blank and valid password
		Then Validate the error message when username is blank

  #TC 005 - Validate that the user is not allowed leaves blank Password field
	Scenario: Validate when Password field is blank
		When Enter the password as blank
		Then Validate message when Password field is blank

  #TC 006 - Validate that the user is not allowed to login with valid Usename and invalid Password
	Scenario: Validate the login with valid Username and invalid Password
		When  login with valid Username and invalid Password
		Then Validation message invalid password

#TC 007 - Validate that the user is not allowed to login with invalid Usename and valid Password
	Scenario: Validate that the user is not allowed to login with invalid Username and valid Password
		When login with invalid Username and valid Password
		Then Validation message invalid username