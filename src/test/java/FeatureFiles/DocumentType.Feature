Feature: Document Type Functionality

  Background:
    Given Navigate to Mersys
    When User enter valid login information and click login button
    Then User should login successfully
    And Click on the element in LeftNav
      | navSetup      |
      | chParameters  |
      | documentTypes |

  Scenario: Create document Types
    Given Click on the element in Dialog
      | plusButton |
    When User sending the keys in Dialog
      | nameInput   | Uyvar              |
      | description | I love TechnoStudy |
    Then Click on the element in Dialog
      | bankSelect          |
      | documentStageSelect |
      | saveButton          |
    And Success message should be displayed

  Scenario: Edit document Types
    And Click on the element in Dialog
      | editButton |
    And User sending the keys in Dialog
      | nameInput | Eaves |
    And Click on the element in Dialog
      | saveButton |
    Then Success message should be displayed

  Scenario: Delete document types
    And User delete the element from Dialog
      | Eaves |
    Then Success message should be displayed
