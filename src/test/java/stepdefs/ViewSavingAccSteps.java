package stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.FindBy;
import pages.ViewSavingAccPage;

public class ViewSavingAccSteps {


    
    ViewSavingAccPage viewSavingAccPage = new ViewSavingAccPage();



    @Then("verify View Savings Btn is displayed")
    public void verify_view_savings_btn_is_displayed() {
        viewSavingAccPage.verifyNewSavingBtnIsVisible();
    }

    @When("user clicks on View Saving option Btn")
    public void user_clicks_on_view_saving_option_btn() {
        viewSavingAccPage.clickOnNewSavingBtn();
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
