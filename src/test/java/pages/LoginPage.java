package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;

public class LoginPage extends BasePage{

    //@FindBy() annotation takes in a type of locator and the actual locator String itself in order to find and initialize
    //that element to the WebElement variable created below it
    @FindBy (id = "username")
    WebElement usernameInput;

    @FindBy (id = "password")
    WebElement passwordInput;

    @FindBy (id = "submit")
    WebElement submitBtn;

    @FindBy (xpath = "//*[@class='badge badge-pill badge-danger']")
    WebElement  errorMessageLogo;

    @FindBy(id = "remember-me")
    WebElement RememberMeBox;

    @FindBy(className = "align-content")
    WebElement DigitalBankLogo;


    public void enterValidLoginInfo() {

        usernameInput.sendKeys("LoloPolo123@gmail.com");
        passwordInput.sendKeys("LoloPolo123");

        //usernameInput.sendKeys("test@tester.com");
       // passwordInput.sendKeys("Tester123");

    }

    public void enterValidLoginInfo(String username, String password) {

        usernameInput.sendKeys(ConfigReader.getConfigProperty(username));
        passwordInput.sendKeys(ConfigReader.getConfigProperty(password));
    }


    public void enterInvalidLoginInfo(String invalidName,String invalidPassword){
        usernameInput.sendKeys(ConfigReader.getConfigProperty(invalidName));
        passwordInput.sendKeys(ConfigReader.getConfigProperty(invalidPassword));
    }

    public void verifyUserIsNotLoggedIn(){
        Assert.assertTrue("Error message is not displayed",errorMessageLogo.isDisplayed());
    }

    public void clickSignInBtn(){
        submitBtn.click();
    }


    public void clickOnRememberMeBox(){
        RememberMeBox.click();
    }

    public void enterValidPasswordOnly(String passwordOnly){
        passwordInput.sendKeys(ConfigReader.getConfigProperty(passwordOnly));
    }

    public void navigateBackToLoginPage(){

        driver.navigate().back();
    }
    public void verifyUserIsBackOnLoginPage(){
        Assert.assertTrue("Digital BankLogo Is Not Visible",DigitalBankLogo.isDisplayed());
    }



//    public void clickSignUpBtn(){
//        submitBtn.click();
//    }


//    public void verifyRegistrationIsSuccessful(){
//        Assert.assertTrue("Registration is not successful",v);
//    }
}
