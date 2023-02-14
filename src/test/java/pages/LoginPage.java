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

    public void clickSignInBtn(){
        submitBtn.click();
    }

//    public void clickSignUpBtn(){
//        submitBtn.click();
//    }


//    public void verifyRegistrationIsSuccessful(){
//        Assert.assertTrue("Registration is not successful",v);
//    }
}
