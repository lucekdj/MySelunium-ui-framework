package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.CommonMethods;
import utilities.ConfigReader;
import utilities.DriverUtilities;

public class Hooks {

    @Before
    public void setUp(Scenario scenario){

        //Her we are initializing the properties object what is in side of  the ConfigReader class we created
        ConfigReader.initializeProperties();
        DriverUtilities.createDriver(scenario);
    }

    @After
    public void tearDown(Scenario scenario) throws InterruptedException {
        //Here we are using the scenario.attach() method in order to attach our screenshot to the scenario
        //The parameters we are passing is the byte[] array screenshot which is generated by the takeScreenshot method
        //The media type image/png since this is an image of png type
        //and the name of the scenario as the name of the image
        //Here we are creating an instance of TakeScreenshot interface by casting driver to it
        //Take screenshot is similar to JSExecutor in the way its built so we can create an instance of it
        //by casting driver to it
        if(scenario.isFailed()) {
            scenario.attach(CommonMethods.takeScreenshot(), "image/png", scenario.getName());
        }
        CommonMethods.takeScreenshot(scenario);
        Thread.sleep(2000);
        DriverUtilities.quitDriver(scenario);


        //DriverUtilities.getDriver().quit();  --- orgin only thise
    }
}
