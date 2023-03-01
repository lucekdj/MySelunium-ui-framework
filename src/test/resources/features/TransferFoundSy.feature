Feature: Transfer Fund  feature


  @Smoke
  Scenario: Verify user is able to login with valid credentials
    Given user enters valid "valid.username3" and "valid.password3"
    When user clicks on Sign In button

    Then verify user is successfully logged in to the account
    When user clicks on transfer between accounts

    Then verify user is on Internal transfer page
    When user select from account "transfer.from.account3"
    And user select to account "transfer.to.account3"
    And user enter amount "transfer.amount3"
    #And user enter amount "30"
    And user clicks on submitTransfer button

    Then verify user is on View Accounts Page
    And verify transaction history displayed for the new transaction
    And verify transaction details getting updated into the database

