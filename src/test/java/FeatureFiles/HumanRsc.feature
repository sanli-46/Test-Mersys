Feature: Test Mersys

  Background:
    Given Navigate to Mersys
    When User enter valid login information and click login button
    Then User should login successfully

  Scenario: Add documentation
    When Must add user documentation
    Then Must be able to edit user documentation
    And User should be able to delete documentation
