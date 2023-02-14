package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage{


    @FindBy(xpath = "//*[text()=' Sign Up Here']")
    WebElement signUpBtn;

    public void userIsClickingSignUpBtn(){
         signUpBtn.click();
    }


}
