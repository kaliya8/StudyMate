@smoke
Feature: Studymate adding new student
  Scenario: Verifying add students
    Given  user is on studyMate student page
    When user clicks add student button
    And enters all required credentials
    Then user need fill the form
    And  user click add button