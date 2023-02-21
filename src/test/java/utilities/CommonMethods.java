package utilities;

import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class CommonMethods {
    public static byte[] takeScreenshot(){
        // Here we are creating an instance of TakeScreenshot interface by casting driver to it
        TakesScreenshot takesScreenshot = (TakesScreenshot) DriverUtilities.getDriver();
        //here we are saving a screenshot in byte array for later use
        byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);

        return  screenshot;
    }

    public static void takeScreenshot(Scenario scenario){
        try {
            if (scenario.isFailed()) {
                File screensot = ((TakesScreenshot) DriverUtilities.getDriver()).getScreenshotAs(OutputType.FILE);
                try {
                    FileUtils.copyFile(screensot, new File("target/automation/screenshots/" + scenario.getName() + ".png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            System.out.println("The error happened while taking screenshot and cleaning up after the test");
            e.getMessage();
        }
    }



}
