Feature: This is to test the login page of application

  Scenario: To test the login success scenario
    Given I navigate to website
    And I provide valid "username" and valid "password".
    When I click on login button
    Then I should be able to login