@smoke
Feature: StudyMate Pagination
  Scenario: Verifying the pagination functionality
    Given User is on Studymate Web application
    When User enters valid credentials "studymate@gmail.com" and "123123" and clicks login
    And User clicks on Groups on the sidebar menu
    Then User should able to see pagination show of "6" by default

    Scenario: Verifying the requested pagination functionality
      Given User is on Studymate Web application
      When User enters valid credentials "studymate@gmail.com" and "123123" and clicks login
      And User clicks on Groups on the sidebar menu
      And User enters "number" to pagination input box
      Then User should able to see "number" of wanted items on the page