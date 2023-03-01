package stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomeStepsSy {

    // HomePage homePage = new HomePage(); Alex suggest to create object of the class
    // in every method like local
    @Then("verify user is successfully logged in to the account")
    public void verify_user_is_successfully_logged_in_to_the_account() {
        HomePage homePage = new HomePage();
        homePage.verifyHomePage();
    }

    @When("user clicks on transfer between accounts")
    public void user_clicks_on_transfer_between_accounts() {
        HomePage homePage = new HomePage();
        homePage.clickOnTransferBetweenAccounts();
    }

}
