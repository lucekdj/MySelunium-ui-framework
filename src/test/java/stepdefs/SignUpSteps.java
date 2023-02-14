package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.*;

public class SignUpSteps {

    SignUpPage signUpPage = new SignUpPage();
    FirstFillOutFormPage firstFillOutFormPage = new FirstFillOutFormPage();
    SecondFillOutFormPage secondFillOutFormPage = new SecondFillOutFormPage();
    @Given("user clicks on sign up button")
    public void user_clicks_on_sign_up_button() {
       signUpPage.userIsClickingSignUpBtn();
    }

    @Then("verify user is on the first SignUp page")
    public void verify_user_is_on_the_first_sign_up_page() {
        firstFillOutFormPage.verifyUserIsOnTheFirstPage();
    }

    @And("user fills the form for gender {string}")
    public void userFillsTheFormForGender(String title) {
        firstFillOutFormPage.fillTheFirstPageOfSignUp(title);
    }
   

//    @Given("user fills the form for gender {title}")
//    public void user_fills_the_form_for_gender(String title) {
//       // firstFillOutFormPage.fillTheFirstPageOfSignUp();
//        firstFillOutFormPage.fillTheFirstPageOfSignUp(title);
//    }

    @When("user clicks the next button")
    public void user_clicks_the_next_button() {
        firstFillOutFormPage.clickNextBtn();
    }

    @Then("verify user is on the second  SignUp page")
    public void verify_user_is_on_the_second_sign_up_page() {
       //secondFillOutFormPage.verifyUserIsOnTheSecondPage();

    }
    @When("user fills the form for the second page")
    public void user_fills_the_form_for_the_second_page() {
        secondFillOutFormPage.fillTheSecondSignUpPage();

    }
    @When("use clicks the register button")
    public void use_clicks_the_register_button() {
        secondFillOutFormPage.clickRegisterBtn();
    }



}