package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigReader;
import utilities.DriverUtilities;

public class Hooks {

    @Before
    public void setUp(){

        //Her we are initializing the properties object what is in side of  the ConfigReader class we created
        ConfigReader.initializeProperties();

        DriverUtilities.createDriver();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        DriverUtilities.getDriver().quit();
    }
}
