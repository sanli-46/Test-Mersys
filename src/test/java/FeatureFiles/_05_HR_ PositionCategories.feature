Feature: HR_PositionCategories Functionality

  Background:
    Given Navigate to Mersys
    When User enter valid login information and click login button
    Then User should login successfully
    And Click on the element in LeftNav
      | navHumanResources      |
      | chdHRSetup             |
      | chPositionCategories   |

  Scenario: Create HR PositionCategories
    And Click on the element in Dialog
      | plusButton |
    And User sending the keys in Dialog
      | nameInput | HR |
    And Click on the element in Dialog
      | saveButton|
    Then Success message should be displayed

  Scenario: Edit HR PositionCategories
    And User sending the keys in Dialog
      | searchNameLabel  | HR |
    And Click on the element in Dialog
      | searchButton |
    And Click on the element in Dialog
      | editButton |
    And User sending the keys in Dialog
      | nameInput  | HR Specialist |
    And Click on the element in Dialog
      | saveButton |
    Then Success message should be displayed

  Scenario: Delete HR PositionCategories
    And User delete the element from Dialog
      | deleteButton |
      | HR Specialist  |
    Then Success message should be displayed