$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:p5/casestudy5.feature");
formatter.feature({
  "name": "SignUp",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "NewUser SignUp",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@NewUser"
    }
  ]
});
formatter.step({
  "name": "User navigates to url",
  "keyword": "Given "
});
formatter.match({
  "location": "casestudy5.user_navigates_to_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters \"Lalitha\" and 123",
  "keyword": "And "
});
formatter.match({
  "location": "casestudy5.enters_and(String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on signup button",
  "keyword": "When "
});
formatter.match({
  "location": "casestudy5.user_click_on_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the welcome page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "casestudy5.the_welcome_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login existing user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "user enters user name",
  "keyword": "Given "
});
formatter.match({
  "location": "casestudy5.user_enters_user_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password",
  "keyword": "And "
});
formatter.match({
  "location": "casestudy5.user_enters_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "When "
});
formatter.match({
  "location": "casestudy5.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "casestudy5.home_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});