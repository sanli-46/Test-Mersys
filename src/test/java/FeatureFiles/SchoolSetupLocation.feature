Feature: School Setup Locations Functionality

  Background:
    Given Navigate to Mersys
    When User enter valid login information and click login button
    Then User should login successfully
    And Click on the element in LeftNav
      | setup         |
      | chSchoolSetup |
      | chLocations   |

  Scenario: Create School Locations
    And Click on the element in Dialog
      | addButton       |

    And User sending the keys in Dialog
      | capacity  | 100       |
      | nameInput | NewYork   |
      | shortNameInput | NY   |

    And Click on the element in Dialog
      | saveButton |
    Then Success message should be displayed

  Scenario: Edit School Locations
    And Click on the element in Dialog
      | editButton |
    And User sending the keys in Dialog
      | nameInput | Brooklyn |

    And Click on the element in Dialog
      | saveButton |
    Then Success message should be displayed

  Scenario: Delete School Locations
    And User Delete the element from Dialog
      | deleteImageBtn  |
      | Brooklyn |