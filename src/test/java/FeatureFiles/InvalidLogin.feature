Feature: Login Functionality

  Scenario: Login with invalid information

    Given Navigate to Mersys
    When User enter invalid login information and click login button
    Then User should login unsuccessfully
