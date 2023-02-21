package pages;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;

import java.util.List;

public class ViewSavingAccPage extends BasePage {


    @FindBy(id = "view-savings-menu-item")
    WebElement viewSavingBtn;

    @FindBy(xpath = "//h1[text()='View Savings Accounts']")
    WebElement viewSavAccTitle;


    @FindBy(xpath = "//span[@class='badge badge-pill badge-success']")
    WebElement confirmationSign;




    // only one name WebElement  AccountName  in the frame new saving acc (there are many older accounts,same and different names)
    @FindBy(linkText = "LoloPoloVacation!!")
    WebElement savingAccName;

    // address of all frames of  savings accounts  created  (exp :17)
    @FindBy(xpath = "//*[@action='/bank/account/savings-view']")
    List<WebElement> listOfSavingAccounts;

    // All names  of WebElement AccountNames from all frames  savings accounts (also from many older accounts created)
    @FindBy(xpath = "//div[@class='card bg-flat-color-5 text-light']/form/div/div[1]")
    List<WebElement> listOfAccountName;

    @FindBy(xpath = "//div[@class='card bg-flat-color-5 text-light']/form/div/div[2]/small")
    List<WebElement> listOfAccountTape;

    @FindBy(xpath = "//div[@class='card bg-flat-color-5 text-light']/form/div/div[3]/small")
    List<WebElement> listOfOwnershipType;

    @FindBy(xpath = "//div[@class='card bg-flat-color-5 text-light']/form/div/div[7]")
    List<WebElement> listOfNewAccDepositBalance;


    public void clickOnNewSavingBtn() {
        viewSavingBtn.click();
    }

    public void verifyNewSavingBtnIsVisible() {
        Assert.assertTrue("View Saving Btn is not visable", viewSavingBtn.isDisplayed());
    }


    public void verifyIsOnViewSavingPage() throws InterruptedException {
          Actions actions = new Actions(driver);
//        actions.moveToElement(viewSavAccTitle);
          actions.scrollToElement(savingAccName);
          Assert.assertTrue("View Saving Page Is Not Displayed", viewSavAccTitle.isDisplayed());
        //Assert.assertTrue("Confirmation message is not displayed", confirmationSign.isDisplayed());
        Thread.sleep(5000);
    }


//    public void verifyEnteredInfoIsCorrect() {
//
//        Assert.assertTrue("Account doesn't exist ",listOfSavingAccounts.get(listOfAccountName.size()-1).getText().contains("LoloPoloVacation!!"));
//        Assert.assertTrue("Account doesn't exist ",listOfSavingAccounts.get(listOfAccountTape.size()-1).getText().contains("Savings"));
//        Assert.assertTrue("Account doesn't exist ",listOfSavingAccounts.get(listOfOwnershipType.size()-1).getText().contains("Joint"));
//        Assert.assertTrue("Account doesn't exist ",listOfSavingAccounts.get(listOfNewAccDepositBalance.size()-1).getText().contains("2901.00"));
//
//    }

    public void verifyEnteredInfoIsCorrect() {
        for (WebElement actualSavingAcc : listOfSavingAccounts ){

            String listOfAccountName = ConfigReader.getConfigProperty("saving.accName");
            String listOfAccountTape = ConfigReader.getConfigProperty("saving.accType");
            String listOfOwnershipType = ConfigReader.getConfigProperty("saving.accOwnership");
            String listOfNewAccDepositBalance = ConfigReader.getConfigProperty("saving.accDepositBalance");

            if(actualSavingAcc.getText().contains(listOfAccountName)&&
               actualSavingAcc.getText().contains(listOfAccountTape)&&
               actualSavingAcc.getText().contains(listOfOwnershipType)&&
               actualSavingAcc.getText().contains(listOfNewAccDepositBalance)){


            }
        }




    }
}

