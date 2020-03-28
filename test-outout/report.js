$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Shilpa Khandge/eclipse-workspace/CucumberPOMDemo/src/main/java/com/qa/crm/config/pomlogin.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM application test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM application test with pom",
  "description": "",
  "id": "free-crm-application-test;free-crm-application-test-with-pom",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user opens the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user is on homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user verifies correctuser is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user verifies the contacts tab",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user verifies the deals tab",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "PomStepDefinition.user_opens_the_application()"
});
formatter.result({
  "duration": 16753201600,
  "status": "passed"
});
formatter.match({
  "location": "PomStepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "duration": 9259518700,
  "status": "passed"
});
formatter.match({
  "location": "PomStepDefinition.user_is_on_homepage()"
});
formatter.result({
  "duration": 14480400,
  "status": "passed"
});
formatter.match({
  "location": "PomStepDefinition.user_verifies_correctuser_is_displayed()"
});
formatter.result({
  "duration": 161232300,
  "status": "passed"
});
formatter.match({
  "location": "PomStepDefinition.user_verifies_the_contacts_tab()"
});
formatter.result({
  "duration": 71539000,
  "status": "passed"
});
formatter.match({
  "location": "PomStepDefinition.user_verifies_the_deals_tab()"
});
formatter.result({
  "duration": 76242900,
  "status": "passed"
});
formatter.match({
  "location": "PomStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 672643300,
  "status": "passed"
});
});