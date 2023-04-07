@smoke
Feature: Assigning teacher to a course as an Admin
  Scenario: 13 Removing already assigned teacher from the course description
    Given I am on the login page of StudyMate application
    And I login with "studymate@gmail.com" and "123123"

    And I click on courses option on a side bar menu
      When I click on the course
      And I click on the Trash button
      And I click on delete button
      Then I should see the pop-up message "Instructor was successfully deleted from the course"


















