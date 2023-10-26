Feature: AdminPanel Functionality


  Background:
    Given Navigate to Mersys
    When User enter valid login information and click login button
    Then User should login successfully
    And Click on the element in LeftNav
      | navSetup        |
      | chParameters    |
      | chDiscount    |

  Scenario: Create Discounts
    And Click on the element in Dialog
      | plusButton     |
    And User sending the keys in Dialog

      | description    |  abc      |
      | integrationCode      | abc456 |
      | priority | 12 |

    And Click on the element in Dialog
      | description    |
      | saveButton |
    Then Success message should be displayed

  Scenario: Edit a Discounts
    And Click on the element in Dialog
      | editButton |
    And User sending the keys in Dialog
      | description    |  abc123      |
    And Click on the element in Dialog
      | saveButton |
    Then Success message should be displayed

  Scenario: Delete a Discounts
    And User delete the element from Dialog
      |  abc123|
    Then Success message should be displayed