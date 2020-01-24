Feature: Test login functionality for demowebshop

@validlogin
Scenario: Test demowebshop with valid credentials
Given Open chrome and start application
When I enter valid username and password
Then User should be able to login


@invalidlogin
Scenario: Test demowebshop with invalid credentials
Given Open chrome and 
When I enter invalid username and password
Then User should not be able to login

