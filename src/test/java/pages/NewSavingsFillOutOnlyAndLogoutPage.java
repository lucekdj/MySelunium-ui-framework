package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewSavingsFillOutOnlyAndLogoutPage {

    @FindBy(xpath = "//img[@class='user-avatar rounded-circle']")
    WebElement userAvatarImage;

    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement logoutBtn;

    @FindBy(xpath = "//span[text()='Success']")
    WebElement logoutSuccessImage;


}
