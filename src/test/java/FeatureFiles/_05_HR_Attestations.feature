Feature: HR_Attestations Functionality

  Background:
    Given Navigate to Mersys
    When User enter valid login information and click login button
    Then User should login successfully
    And Click on the element in LeftNav
      | navHumanResources |
      | chdHRSetup        |
      | chAttestations    |

  Scenario: Create HR Attestations
    And Click on the element in Dialog
      | plusButton         |
    And User sending the keys in Dialog
      | nameInput | John  |
    And Click on the element in Dialog
      | saveButton |
    Then Success message should be displayed

  Scenario: Edit HR Attestations
    And Click on the element in the Dialog
      | John  |
    And Click on the element in Dialog
      | searchButton |
    And Click on the element in Dialog
      | editButton |
    And User sending the keys in Dialog
      | nameInput | John1 |
    And Click on the element in Dialog
      | saveButton |
    Then Success message should be displayed

  Scenario: Delete a HR Attestations
    And User delete the element from Dialog
      | deleteButton |
      | John1 |
    Then Success message should be displayed