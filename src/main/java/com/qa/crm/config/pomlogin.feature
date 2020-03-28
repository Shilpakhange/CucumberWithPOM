Feature: Free CRM application test

Scenario: Free CRM application test with pom
Given user opens the application
When user enters username and password
Then user is on homepage
Then user verifies correctuser is displayed
Then user verifies the contacts tab
Then user verifies the deals tab
Then close the browser