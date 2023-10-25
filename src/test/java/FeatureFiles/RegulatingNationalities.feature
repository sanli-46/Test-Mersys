Feature: Editing Nationalities under Parameters Setting

  Background:
    Given Navigate to Mersys
    When User enter valid login information and click login button
    Then User should login successfully

  Scenario: Regulating Nationalities
    And Click on the element in LeftNav
      | navSetup        |
      | chParameters    |
      | chNationalities |
    When Nationalities add
    Then Nationalities create
    And Verifications
    Then Delete
