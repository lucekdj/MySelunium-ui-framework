Feature: Login feature


  @Smoke
  Scenario: Verify user is able to login with valid credentials
    Given user enters valid "valid.username" and "valid.password--------"
    When user clicks on Sign In button
    Then verify user is successfully logged in to the account


  @InvalidLogin
  Scenario: Verify user is not able to login with invalid credentials
      Given user enters invalid username "invalid.username" and invalid password "invalid.password"
      When user clicks on Sign In button
      Then verify user is not logged in to the account



  @RememberMe
  Scenario: Verify user  username entry is remembered
      Given user enters valid "valid.username" and "valid.password"
      And user clicks on RememberMe button
      When user clicks on Sign In button
      Then verify user is successfully logged in to the account
      When user navigate to previous login page
      Then verify user is back on login page
      When user login entering valid password "valid.password" only
      And user clicks on Sign In button
      Then verify user is successfully logged in to the account