package stepdefs;

import io.cucumber.java.en.Then;
import pages.ViewAccountPageSy;
//import pages.ViewAccountPageSy;

public class ViewAccountStepsSy {

    ViewAccountPageSy viewAccountPage = new ViewAccountPageSy();

    @Then("verify user is on View Accounts Page")
    public void verify_user_is_on_view_accounts_page() {
        viewAccountPage.verifyAccountPage();


    }

    @Then("verify transaction history displayed for the new transaction")
    public void verify_transaction_history_displayed_for_the_new_transaction() {
        viewAccountPage.verifyTransactionHistory();

    }

    @Then("verify transaction details getting updated into the database")
    public void verify_transaction_details_getting_updated_into_the_database() {
        viewAccountPage.verifyDetailsIntoDataBase();


    }
}
