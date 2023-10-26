Feature: AdminPanel Functionality

  Background:
    Given Navigate to Mersys
    When User enter valid login information and click login button
    Then User should login successfully
    And Click on the element in LeftNav
      | navSetup |
      | navParameters |
      | navFields     |
  Scenario: Create AdminPanel
    And Click on the element in Dialog
      | addButton |
    And User sending the keys in Dialog
      | nameInput | burak      |
      | codeInput | 06       |
    And Click on the element in Dialog
      | saveButton |
    Then Success message should be displayed


    Scenario: Edit admin panel
      And Click on the element in Dialog
      |nameInput|burak|
      And Click on the element in Dialog
      |searchButton|
      And User sending the keys in Dialog
        |nameInput|burak123|
      And Click on the element in Dialog
      |saveButton|
      When Click on the element in Dialog
      |editButton|

    Scenario: Delete Admin Panel
      And User delete the element from Dialog
      |deleteImageBtn|
      |     burak123         |
