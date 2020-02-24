Feature: Login into TestMeApp

Scenario Outline: Successful login
 Given user is on the login page 
 When user enters "<username>" and "<password>"
 Then user does successful login
 
 Examples:
 |username |password    |
 |lalitha  |password123 |