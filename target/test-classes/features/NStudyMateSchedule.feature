@smoke
Feature:  Schedule Event
  Scenario:  Verifying Schedule Event on Calendar
    Given I am on the login page of StudyMate application
    And I login with "studymate@gmail.com" and "123123"

    And I click  on schedule option on a side bar menu
    And user clicks on Create event button
    And user after completing the details for the Event
    Then user should be able to schedule Event on Calendar


