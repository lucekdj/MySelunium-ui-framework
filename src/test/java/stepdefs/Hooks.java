package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
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
        Thread.sleep(2000);
        //DriverUtilities.getDriver().quit();
        DriverUtilities.quitDriver(scenario);
    }
}
