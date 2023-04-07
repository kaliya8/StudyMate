@smoke
Feature: (Zarrina)Blocking students on the application
  Scenario: Blocking students
  #When Admin blocks certain student by clicking 3 dots in the
  #students list and click block, that students should see any courses when they login

    Given Admin logs on Studymate application
    And Admin clicks on Students from tag options
    Then Admin clicks on three dots
    And Admin chooses block option from three dots
    When Admin clicks on verify block button
    Then Admin should see a message "Student successfully blocked"