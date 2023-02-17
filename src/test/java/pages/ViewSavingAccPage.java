package pages;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ViewSavingAccPage extends BasePage{



    @FindBy(xpath = "//h1[text()='View Savings Accounts']")
    WebElement viewSavAccTitle;


    @FindBy(xpath = "//span[@class='badge badge-pill badge-success']")
    WebElement confirmationSign;

    @FindBy(linkText = "LoloPoloVacation!!")
    WebElement savingAccName;



@FindBy(xpath = "//*[@action='/bank/account/savings-view']")
    List<WebElement> listOfSavingAccounts;




    public void verifyIsOnViewSavingPage() throws InterruptedException {
        Assert.assertTrue("View Saving Page Is Not Displayed",viewSavAccTitle.isDisplayed());
        Assert.assertTrue("Confirmation message is not displayed",confirmationSign.isDisplayed());
        Thread.sleep(3000);
    }





    public void verifyEnteredInfoIsCorrect() {

        Assert.assertTrue("Account doesn't exist ",listOfSavingAccounts.get(listOfSavingAccounts.size()-1).getText().contains("LoloPoloVacation!!"));
        Assert.assertTrue("Account doesn't exist ",listOfSavingAccounts.get(listOfSavingAccounts.size()-1).getText().contains("Savings"));
        Assert.assertTrue("Account doesn't exist ",listOfSavingAccounts.get(listOfSavingAccounts.size()-1).getText().contains("Joint"));
        Assert.assertTrue("Account doesn't exist ",listOfSavingAccounts.get(listOfSavingAccounts.size()-1).getText().contains("1000.00"));

    }


}
