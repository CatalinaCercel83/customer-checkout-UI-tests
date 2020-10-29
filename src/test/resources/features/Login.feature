@done

Feature: Login Functionality

  Scenario: Verify that the user would be able to sign in
    Given the user  should open the login shopping webPage url
    When the user is inserting valid credentials
    Then the home page should be display ready for shopping