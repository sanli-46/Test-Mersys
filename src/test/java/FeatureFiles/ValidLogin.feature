Feature: Login Functionality

  Scenario: Login with valid information

    Given Navigate to Mersys
    When User enter valid login information and click login button
    Then User should login successfully
