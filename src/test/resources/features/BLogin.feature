
Feature: Study Mate Login
  Scenario: Verifying the login functionality positive
    Given User is on Studymate Web application
    When User enters valid credentials "studymate@gmail.com" and "123123" and clicks login
    Then User should successfully login to application

