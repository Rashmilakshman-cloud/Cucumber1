Feature: SignUp

  @NewUser
  Scenario: NewUser SignUp
  Given User navigates to url
  And enters "Lalitha" and 123
  When user click on signup button
  Then the welcome page is displayed

  @Login
  Scenario: Login existing user
  Given user enters user name
  And user enters password
  When user clicks on login button
  Then home page is displayed