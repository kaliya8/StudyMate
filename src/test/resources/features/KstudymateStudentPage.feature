@smoke
Feature: Verifying search results
  Scenario: Positive Verifying search results
    Given I am on the login page of StudyMate application
    And I login with "studymate@gmail.com" and "123123"
    When user clicks on sign in button
    And user clicks on Students button
    When user searches student by "jackie chan"
    Then user should see student with this "jackie chan"






