Feature: Launcher run an end-to-end user flow
  Scenario: As a user I should be able to display hello message
    When I launch the application
    And I validate welcome message is present
    And I click on go button
    Then I validate launcher message