package pages;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;


public class CreateNewSavingAccPage extends BasePage{

    Faker faker = new Faker();
    String fakerNameEntry = null;
    @FindBy (id = "page-title")
    WebElement createSavings_Title;




    @FindBy(id = "Savings")
    WebElement radioSavings;

    @FindBy(xpath = "//input[@id='Money Market']")
    WebElement radioMoneyMarket;

    @FindBy(id = "Individual")
    WebElement radioIndividual;

    @FindBy(id = "Joint")
    WebElement radioJoint;

    @FindBy(id = "name")
    WebElement accNameEntry;

    @FindBy(id = "openingBalance")
    WebElement initDepositEntry;

    @FindBy(id = "newSavingsSubmit")
    WebElement submitBtn;




    public void verifyCreateSavTitleIsDisplayed(){
        Assert.assertTrue("Create Savings Form Pg is Not Displayed",createSavings_Title.isDisplayed());
    }



    public void accountTapeOption()  {

        try {
            radioSavings.click();
            Thread.sleep(2000);
            radioJoint.click();
            Thread.sleep(2000);

        }catch(Exception e){
            e.printStackTrace();

        }

    }

    public void accountNameAndDeposit(String amount){
       // accNameEntry.sendKeys("LoloPoloVacation!!");
        fakerNameEntry = faker.funnyName().name() + " --Vacation";
        accNameEntry.sendKeys(fakerNameEntry);

        initDepositEntry.sendKeys(ConfigReader.getConfigProperty(amount));

    }

    public void clickOnSubmitBtn(){
        submitBtn.click();
    }



}




