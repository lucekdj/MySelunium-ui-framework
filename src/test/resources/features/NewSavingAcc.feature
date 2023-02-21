Feature:  New SavingAcc Feature

  Background: Verify User Is Able To Login to the Account
    Given user enters valid "valid.username" and "valid.password"
    When user clicks on Sign In button


  Scenario: User Is Able To Create Saving Account
    Given verify user is successfully logged in to the account
    When user clicks on saving option Btn
    Then verify New Savings Btn is displayed
    When user select New Savings option
    Then verify Create Savings Page is displayed
    When user select AccountType and Ownership
    And user fills out the forms for name and "initDeposit.amount"
#    And user clicks on submit button
    Then verify user is on View Saving Page
    And verify entered info is correct

  Scenario: User is able to verify info from his created savings accounts
    Given verify user is successfully logged in to the account
    When user clicks on saving option Btn
    Then verify View Savings Btn is displayed
    When user clicks on View Saving option Btn
    Then verify user is on View Saving Page
    And verify entered info is correct





  Scenario Outline: User Is Able To Fill Out New Saving Account Form And Reset
    Given verify user is successfully logged in to the account
    When user clicks on saving option Btn
    Then verify New Savings Btn is displayed
    When user select New Savings option
    Then verify Create Savings Page is displayed
    And user select savings AccountType "<optionsType>"
  And user select savings AccountOwnership "<optionsOwner>"
  And user fills out the form for "accName" and "initDeposit"
  And user clicks on submit resetBtn
  Then  verify Create Savings Page is displayed
  And user clicks on UserAvatar image
  Then verify Logout dropdown is visible
  And user click on Logout Btn
  Then verify user is successfully logged out
  Examples:
    | optionsType  | optionsOwner |
    | Savings      | Individual   |
    | Money Market | Joint        |
    | Savings      | Joint        |
    | Money Market | Individual   |














