@smoke
Feature: Deleted student in trash

  Scenario: Verifying deleted student in trash
    Given user on home page
    And user clicks on branch students
    When user deletes student
    And user goes to trash
    Then user verifies deleted student
