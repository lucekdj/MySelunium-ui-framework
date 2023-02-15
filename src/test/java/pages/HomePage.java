package pages;

import org.junit.Assert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy (xpath = "//li[@class='active']")
    WebElement welcomeTestMessage;
    //it is same like
    //WebElement welcomeTestMessage = driver.findElement(By.xpath("//li[@class='active']"));
    public void verifyHomePage(){
        Assert.assertTrue("Welcome test message not visible could be on wrong page", welcomeTestMessage.isDisplayed());
    }

}
