Feature: GradeLevels Functionality

  Background:
    Given Navigate to Mersys
    When User enter valid login information and click login button
    Then User should login successfully
    And Click on the element in LeftNav
      | navSetup        |
      | chParameters    |
      | chGradeLevels   |

  Scenario: Create Grade Levels
    And Click on the element in Dialog
      | plusButton  |
    And User sending the keys in Dialog
      | nameInput       | 100        |
      | shortNameInput  | 1          |
      | orderInput      | 1          |


    And Click on the element in Dialog
      | saveButton |
    Then Success message should be displayed

  Scenario: Edit Grade Levels
    And Click on the element in Dialog
      | editButton |
    And User sending the keys in Dialog
      | nameInput       | 100         |
      | shortNameInput  | 5           |
      | orderInput      | 1           |


    And Click on the element in Dialog
      | saveButton |
    Then Success message should be displayed

  Scenario: Delete Grade Levels
    And User Delete the element from Dialog

      | deleteButton      |
      | 100               |

    Then Success message should be displayed