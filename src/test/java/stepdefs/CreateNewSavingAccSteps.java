package stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateNewSavingAccPage;
import pages.HomePage;
import pages.ViewSavingAccPage;


public class CreateNewSavingAccSteps {


    HomePage homePage = new HomePage();
    CreateNewSavingAccPage createNewSavingAccPage = new CreateNewSavingAccPage();
    ViewSavingAccPage viewSavingAccPage = new ViewSavingAccPage();

    @When("user clicks on saving option Btn")
    public void user_clicks_on_saving_option_Btn() {
       homePage.savingsMenuBtn();
    }

    @Then("verify New Savings Btn is displayed")
    public void verify_new_savings_btn_is_displayed() {
        homePage.verifyNewSavBtnIsViVisible();
    }

    @When("user select New Savings option")
    public void user_select_new_savings_option() {
        homePage.clickOnNewSavingsBtn();
       
    }

    @Then("verify Create Savings Page is displayed")
    public void verify_create_savings_page_is_displayed() {
        createNewSavingAccPage.verifyCreateSavTitleIsDisplayed();
    }

    @When("user select AccountType and Ownership")
    public void user_select_account_type_and_ownership() throws InterruptedException {
       createNewSavingAccPage.accountTapeOption();
    }


    @When("user fills out the forms for name and {string}")
    public void user_fills_out_the_forms_for_name_and_deposit(String depositAmount) {
       createNewSavingAccPage.accountNameAndDeposit(depositAmount);
    }

    @When("user clicks on submit button")
    public void user_clicks_on_submit_button() {
       createNewSavingAccPage.clickOnSubmitBtn();
    }

    @Then("verify user is on View Saving Page")
    public void verify_user_is_on_view_saving_page() throws InterruptedException {
       viewSavingAccPage.verifyIsOnViewSavingPage();
    }

    @Then("verify entered info is correct")
    public void verify_entered_info_is_correct() {
       viewSavingAccPage.verifyEnteredInfoIsCorrect();
    }

}
