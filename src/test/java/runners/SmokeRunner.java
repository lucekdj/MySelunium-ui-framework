package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features" ,
        glue ="stepdefs" ,

        tags = "@Smoke or @RememberMe",
        plugin = {"pretty", "html:Target/cucumber-smoke-report.html"}

        //tags = "@InvalidLogin",
        //plugin = {"pretty", "html:Target/cucumber-InvalidLogin-report.html"}

)


public class SmokeRunner {

}
