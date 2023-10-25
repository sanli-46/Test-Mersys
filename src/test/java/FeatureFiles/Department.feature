Feature: Configure Sections (Departments) under School Setting

  Background:
    Given Navigate to Mersys
    When User enter valid login information and click login button
    Then User should login successfully

  Scenario: Departman Configuration
    And Click on the element in LeftNav
      | navSetup      |
      | chSchoolSetup |
      | chDepartments |
    When Departman add
    Then Departman update
    And Verifications
    Then Delete
