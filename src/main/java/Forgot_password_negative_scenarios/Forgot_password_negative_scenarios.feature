Feature: User can reset password by clicking on Forgot password link 

  #TC_001 Validate that the user get the validation message when Phone number field is blank
Scenario: Validate when phone number field is blank
Given Launch the URL
  When Phone number field is blank
  Then Validate the error message when phone number is blank

#TC_002 Validate that the user get the validation message on entering less than ten digit phone number
  Scenario: Validate the message on entering less than ten digit phone number in phone number field
When Enter less than ten digit phone number
  Then Validate the error message for less than ten digits

  #TC_003 Validate that the user get the validation message on entering more than ten digit phone number
Scenario: Validate the message on entering more than ten digit phone number in phone number field
When Enter more than ten digit phone number
  Then Validate the error message for more than ten digits

  #TC_004 Validate that the Send Reset Link button is disabled when Phone number field is blank
Scenario: Validate  the Send Reset Link button is disabled when Phone number field is blank
When  Reset Link button is disabled
Then validate Phone number field is blank


