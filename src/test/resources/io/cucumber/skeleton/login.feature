Feature: login

  Scenario: Correct Credentials
    Given  Open browser
    And    I open login page
    When   I type "tomsmith" as login
    And    I type "SuperSecretPassword!" as password
    And    I click login button
    Then   I am logged in

  Scenario: Incorrect Credentials
    Given  Open browser
    And    I open login page
    When   I type "tomsmith" as login
    And    I type "SuperSecretPassword!" as password
    And    I click login button
    Then   I am NOT logged in
