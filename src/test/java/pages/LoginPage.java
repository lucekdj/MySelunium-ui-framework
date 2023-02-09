package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    public void clickSignInBtn(){
        submitBtn.click();
    }

}
