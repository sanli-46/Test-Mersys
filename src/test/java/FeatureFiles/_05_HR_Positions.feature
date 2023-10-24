Feature: HR_Positions Functionality

  Background:
    Given Navigate to Mersys
    When User enter valid login information and click login button
    Then User should login successfully
    And Click on the element in LeftNav
      | navHumanResources |
      | chdHRSetup        |
      | chPositions       |

  Scenario: Create HR Positions
    And Click on the element in Dialog
      | plusButton     |
    And User sending the keys in Dialog
      | nameInput      | Tester |
      | shortNameInput | Team   |
    And Click on the element in Dialog
      | saveButton |
    Then Success message should be displayed

  Scenario: Edit a HR Position
    And Click on the element in Dialog
      | editButton |
    And User sending the keys in Dialog
      | nameInput      | Tester Updated |
      | shortNameInput | Team Updated   |
    And Click on the element in Dialog
      | saveButton |
    Then Success message should be displayed

  Scenario: Delete a HR Position
    And User delete the element from Dialog
      | deleteButton |
      | Tester Updated |
    Then Success message should be displayed

