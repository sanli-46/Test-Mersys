Feature: Test Mersys

  Background:
    Given Navigate to Mersys
    When User enter valid login information and click login button
    Then User should login successfully
    And Click on the element in LeftNav
      | navSetup     |
      | chParameters |
      | bankAccount  |

  Scenario: Bank account

    When Click on the element in Dialog
      | plusButton |
    Then User sending the keys in Dialog
      | nameInput | dgadg                |
      | iban      | 12334535345636363664 |

    And Click on the element in Dialog
      | bankSelect |
      | EUR        |
    When User sending the keys in Dialog
      | intCode | 12234 |
    Then Click on the element in Dialog
      | saveButton |

  Scenario: Bank Account Edit

    And Click on the element in the Dialog
      | editButton |
    And User sending the keys in Dialog
      | nameInput | 12123 |
    And Click on the element in Dialog
      | saveButton |
    Then Success message should be displayed

  Scenario: Delete a Bank Account
    And User sending the keys in Dialog
      | nameInput | 12123 |
    When Click on the element in Dialog
      | searchButton |
    And User delete the element from Dialog
      | deleteButton    |
      | secDeleteButton |
    Then Success message should be displayed
