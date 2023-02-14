Feature: SignUp feature

  Scenario Outline: User is able to sign up with fake credentials
    Given user clicks on sign up button
    Then verify user is on the first SignUp page
    And user fills the form for gender "<title>"
    When user clicks the next button
    Then verify user is on the second  SignUp page
    And user fills the form for the second page
    And use clicks the register button


    Examples:

      | title |
      | Mr.   |
      | Ms.   |
      | Mrs.  |