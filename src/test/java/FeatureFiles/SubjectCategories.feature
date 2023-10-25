Feature: Subject Categories Functionality
  Background:
    Given Navigate to Mersys
    When User enter valid login information and click login button
    Then User should login successfully

    Scenario: Subject categories configuration
      Given Click on the element in LeftNav
      |     education      |
      |      edSetup       |
      | subjectCategories  |

      When Click on the element in Dialog
      | plusButton |

      Then User sending the keys in Dialog
      | nameInput | EavessX01 |
      | codeInput |  0x1234X  |

      And Click on the element in Dialog
      |saveButton|

      And Success message should be displayed

      When User Delete the element from Dialog
      | EavessX01 |

      And Success message should be displayed

