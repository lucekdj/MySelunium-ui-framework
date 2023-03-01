package stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.InternalTransferPageSy;

public class InternalTransferStepsSy {


    InternalTransferPageSy internalTransferPage= new InternalTransferPageSy();
    @Then("verify user is on Internal transfer page")
    public void verify_user_is_on_internal_transfer_page() {
        internalTransferPage.verifyInternalTransferPage();

    }

    @When("user select from account {string}")
    public void user_select_from_account(String fromAccount) {
        internalTransferPage.selectFromAccount(fromAccount);
    }


    @When("user select to account {string}")
    public void user_select_to_account(String toAccount) {
        internalTransferPage.selectToAccount(toAccount);

    }

    @When("user enter amount {string}")
    public void user_enter_amount(String amount) {
        internalTransferPage.enterAmount(amount);
    }

    @When("user clicks on submitTransfer button")
    public void user_clicks_on_submitTransfer_button() {
        internalTransferPage.clickOnSubmitTransferBtn();

    }
}
