Feature: Account Creation

  Scenario: As a new user, I would like to create a new Account so that I can browse the application
    Given I navigate to SignIn Page
    And I click on Create New Account
    And I enter my account details
    When I save the information
    Then I must be able to verify that I am logged in