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
    And user fills out the forms for name and "deposit.amount"
    And user clicks on submit button
    Then verify user is on View Saving Page
    And verify entered info is correct






#    When user select AccountType "<optionsType>"
#    And user select AccountOwnership "<optionsOwner>"


#    Examples:
#      | optionsType  |optionsOwner|
#      | Savings      | Individual |
#      | Money Market | Joint      |












