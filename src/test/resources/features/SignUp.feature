Feature: SignUp feature

  Scenario Outline: User is able to sign up with fake credentials
    Given user clicks on sign up button
    Then verify user is on the first SignUp page
    And user fills the form for gender "<title>"
    When user clicks the next button
    Then verify user is on the second  SignUp page
    And user fills the form for the second page
    And use clicks the register button

# this will run test 3 times for every option Mr.Ms.Mrs instead only 1 time for Mr.
  #   And user fills the form for gender "Mr."


    Examples:

      | title | title|
      | Mr.   |Hs.   |
      | Ms.   |gd.   |
      | Mrs.  |hd.   |