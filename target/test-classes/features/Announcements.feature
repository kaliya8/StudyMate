@smoke
Feature: Filter Announcements by Group

#  Background: Login and sign in form
#    Given user is on studyMate application
#
#  Scenario Outline: Verifying the login with valid credentails
#    Given user logs in "<email>" and "<password>"
##    Then user should land on studyMate application
#    Examples:
#      | email               | password   |
#      | studymate@gmail.com | 123123     |



  Scenario: Verifying filter announcements by group
    Given I am on the login page of StudyMate application
    And I login with "studymate@gmail.com" and "123123"
    Given admin click on announcements
    When admin clicks on group dropdown
    And admin should able to choose one group
    Then admin should only see the announcements of the selected group