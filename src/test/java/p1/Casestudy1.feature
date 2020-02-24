
Feature: Registering for TestMeApp

  Scenario Outline: Successfull Registration
  Given user access the registration page
  When user enters "<username>" , "<firstname>" , "<lastname>" , "<password>" , "<confirmpassword>" , "<gender>" , "<email>" , "<mobileno>" ,"<dateOfBirth>" ,"<address>","<Securityquestion>","<answer>"
  Then user navigtes to login page
  
   Examples:
   | username|firstname|lastname|password|confirmpassword|gender|email|mobileno|dateOfBirth|address|Securityquestion|answer|
   |Rashu123|Rashmi   |L|12345|12345|female|rashu@gmail.com|9087654|20/01/98|Chennai|My fav food?|Pulao|