package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{


//    WebElement welcomeTestMessage = driver.findElement(By.xpath("//li[@class='active']"));
//    it is same like @FindBy
    @FindBy (xpath = "//li[@class='active']")
    WebElement welcomeUserMessage_Lolo;

    @FindBy (xpath = "//a[@id='savings-menu']")
    WebElement savingsMenuBtn;

    @FindBy (id = "new-savings-menu-item")
    WebElement newSavingsOptBtn;

    @FindBy(id = "transfer-menu-item")
    WebElement transferItemMenu;


    public void verifyHomePage(){
        Assert.assertTrue("Welcome test message not visible could be on wrong page", welcomeUserMessage_Lolo.isDisplayed());
    }


    public void savingsMenuBtn(){
        savingsMenuBtn.click();
    }
    public void verifyNewSavBtnIsViVisible(){
        Assert.assertTrue("New Savings Btn is not displayed",newSavingsOptBtn.isDisplayed());
    }

    public void clickOnNewSavingsBtn() {
        newSavingsOptBtn.click();
    }

    public void clickOnTransferBetweenAccounts() {
        transferItemMenu.click();
    }
}
