package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondFillOutFormPage extends BasePage {

    @FindBy (id = "title")
    WebElement titleSelect;

    @FindBy (xpath = "//*[@id='address']")
    WebElement address;
    @FindBy (xpath = "//*[@id='locality']")
    WebElement locality;
    @FindBy (xpath = "//*[@id='region']")
    WebElement region;
    @FindBy (xpath = "//*[@id='postalCode']")
    WebElement postalCode;
    @FindBy (xpath = "//*[@id='country']")
    WebElement country;
    @FindBy (xpath = "//*[@id='homePhone']")
    WebElement homePhone;
    @FindBy (xpath = "//*[@id='mobilePhone']")
    WebElement mobilePhone;
    @FindBy (xpath = "//*[@id='workPhone']")
    WebElement workPhone;
    @FindBy (xpath = "//*[@id='agree-terms']")
    WebElement agreeBtn;
    @FindBy (xpath = "//*[text()='Register']")
    WebElement registerBtn;

//    public void verifyUserIsOnTheSecondPage() {
//        Assert.assertTrue("First Page not displayed", titleSelect.isDisplayed());
//    }
    public void fillTheSecondSignUpPage(){
        address.sendKeys("345 Victoria Ave");
        locality.sendKeys("Chicago");
        region.sendKeys("IL");
        postalCode.sendKeys("98765");
        country.sendKeys("Usa");
        homePhone.sendKeys("61234567890");
        mobilePhone.sendKeys("61234567890");
        workPhone.sendKeys("61234567890");
        agreeBtn.click();


    }

    public void clickRegisterBtn(){
        registerBtn.click();

    }

}













