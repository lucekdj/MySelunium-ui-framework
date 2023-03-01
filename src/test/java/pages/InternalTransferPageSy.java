package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;

public class InternalTransferPageSy extends BasePage {

    @FindBy(id = "page-title")
    WebElement internalTransferIcon;

    @FindBy(xpath = "//select[@id='fromAccount']")
    WebElement optionFromAccountDropDown;

    @FindBy(xpath = "//select[@id='toAccount']")
    WebElement optionToAccountDropDown;

    @FindBy(xpath = "//input[@id='amount']")
    WebElement enterAmountBar;


    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm']")
    WebElement submitTransferBtn;


    public void verifyInternalTransferPage() {
        Assert.assertTrue("user is not on internal transfer Page", internalTransferIcon.isDisplayed());
        Assert.assertTrue("Internal Transfer Page is not Visible", optionFromAccountDropDown.isDisplayed());
        Assert.assertTrue("Internal Transfer Page is not Visible", optionToAccountDropDown.isDisplayed());

    }


    public void selectFromAccount(String fromAccount) {

        Select selectFrom = new Select(optionFromAccountDropDown);
        //Instead hard coding
         //selectFrom.selectByVisibleText("Shyam (Standard Checking");
        // we use configReader to read from account
        selectFrom.selectByVisibleText(ConfigReader.getConfigProperty(fromAccount));
        //ether way works  we can pass from account or pass key with value what is in feature file  and what it has in config.properties value
        // but it is hardcoding
        //selectFrom.selectByVisibleText(ConfigReader.getConfigProperty("transfer.from.account"));
    }
    public void selectToAccount(String toAccount) {

        Select selectTo = new Select(optionToAccountDropDown);
        selectTo.selectByVisibleText(ConfigReader.getConfigProperty(toAccount));
    }


    public void enterAmount(String amount) {
        enterAmountBar.sendKeys(ConfigReader.getConfigProperty(amount));

//        this works to but you have to put amount 30 in feature file
        //enterAmountBar.sendKeys(amount); no it doesnt work ???

    }

    public void clickOnSubmitTransferBtn() {
        submitTransferBtn.click();
    }

}


