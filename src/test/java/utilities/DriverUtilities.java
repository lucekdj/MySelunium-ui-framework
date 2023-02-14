package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class DriverUtilities {

    static WebDriver driver;

    public static void createDriver(){

        switch (ConfigReader.getConfigProperty("app.browser")){


            case "edge":
                WebDriverManager.edgedriver().setup();
               driver = new EdgeDriver();
                break;

            case "safari":
                WebDriverManager.edgedriver().setup();
                driver = new SafariDriver();
                break;

            case "fireFox":
                WebDriverManager.edgedriver().setup();
                driver = new FirefoxDriver();
                break;

            default:
            // not needed this line because we create with bonigarcia
            // System.setProperty("webriver.chrome.driver" , "src/test/java/driver/chromedriver.exe ");

            //WebDriverManager essentially removes the need to manually manage any drivers.
            //We can use it both "download" and manage the drivers.

            //we can download and use the driver we want by having this dependency.
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //driver.get("http://18.116.88.132:8080/bank/login");   it was before config.properties
        driver.get(ConfigReader.getConfigProperty("app.baseurl"));
    }

    public static WebDriver getDriver(){
        return driver;
    }


}
