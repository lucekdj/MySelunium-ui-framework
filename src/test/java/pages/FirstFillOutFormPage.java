package pages;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class FirstFillOutFormPage extends BasePage{

    @FindBy (xpath = "//select[@name='title']")
    WebElement titleDropDown;
    @FindBy (xpath = "//*[@id='firstName']")
    WebElement firstName;
    @FindBy (xpath = "//*[@id='lastName']")
    WebElement lastName;
    @FindBy (xpath = "//*[@id='gender']")//input[@value='F']

    WebElement gender;
    @FindBy (xpath = "//*[@id='dob']")
    WebElement dateOfBirth;
    @FindBy (xpath = "//*[@id='ssn']")
    WebElement sSN;
    @FindBy (xpath = "//*[@id='emailAddress']")
    WebElement emailAddress;
    @FindBy (xpath = "//*[@id='password']")
    WebElement password;
    @FindBy (xpath = "//*[@id='confirmPassword']")
    WebElement confirmPassword;
    @FindBy (xpath = "//*[text()='Next']")
    WebElement nextBtn;


    public void verifyUserIsOnTheFirstPage() {
        Assert.assertTrue("First Page not displayed", titleDropDown.isDisplayed());

    }


    public void fillTheFirstPageOfSignUp(String title){

        //int SSN = generate9DigitRandomNumber(); ---AlexGroup using generate random
        //Faker faker = new Faker(); is in Base Page so is not making extra space in every function

        Select select = new Select(titleDropDown);
        select.selectByVisibleText(title);

        //new Select(titleDropDown).selectByValue("Mr.");

        firstName.sendKeys("My First Name");
        lastName.sendKeys("My Last Name");
        gender.click();
        dateOfBirth.sendKeys("09/09/1229");
        sSN.sendKeys(faker.idNumber().ssnValid());          //sSN.sendKeys(String.valueOf(SSN));---AlexGroup       //sSN.sendKeys("999-01-2689"); --manual
        emailAddress.sendKeys(faker.internet().emailAddress());                                                      // emailAddress.sendKeys(getSaltString()+"@gmail.com"); ---AlexGroup
        password.sendKeys("LoloPolo123");
        confirmPassword.sendKeys("LoloPolo123");
    }


    public void clickNextBtn(){
        nextBtn.click();
    }


    //---AlexGroup using generate random
//
//    protected String getSaltString() {
//        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
//        StringBuilder salt = new StringBuilder();
//        Random rnd = new Random();
//        while (salt.length() < 10) { // length of the random string.
//            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
//            salt.append(SALTCHARS.charAt(index));
//        }
//        String saltStr = salt.toString();
//        return saltStr;
//
//    }
//
//    public static int generate9DigitRandomNumber() {
//        Random random = new Random();
//        return 100000000 + random.nextInt(900000000);
//    }



}
