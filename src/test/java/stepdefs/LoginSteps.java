package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {


    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();


    @Given("user enters valid {string} and {string}")
    public void user_enters_valid_username_and_password(String username,String password) {
        loginPage.enterValidLoginInfo(username,password);
    }

    @When("user clicks on Sign In button")
    public void user_clicks_on_sign_in_button() {
        loginPage.clickSignInBtn();
    }

//    @Then("verify user is successfully logged in to the account")
//    public void verify_user_is_successfully_logged_in_to_the_account() {
//        homePage.verifyHomePage();
//    }             this is moved to home page  when we build with Shyam


    @Given("user enters invalid username {string} and invalid password {string}")
    public void user_enters_invalid_username_and_invalid_password(String invalidUserName, String invalidUserPassword) {
       loginPage.enterInvalidLoginInfo(invalidUserName,invalidUserPassword);
    }


    @Then("verify user is not logged in to the account")
    public void verify_user_is_not_logged_in_to_the_account() {
        loginPage.verifyUserIsNotLoggedIn();
    }

    @Given("user clicks on RememberMe button")
    public void user_clicks_on_remember_me_button() {
       loginPage.clickOnRememberMeBox();
    }

    @When("user navigate to previous login page")
    public void user_navigate_to_previous_login_page() {
        loginPage.navigateBackToLoginPage();
    }

    @Then("verify user is back on login page")
    public void verify_user_is_back_on_login_page() {
       loginPage.verifyUserIsBackOnLoginPage();
    }

    @When("user login entering valid password {string} only")
    public void user_login_entering_valid_password_only(String password) {
       loginPage.enterValidPasswordOnly(password);
    }
    
    
    
    
    
}


