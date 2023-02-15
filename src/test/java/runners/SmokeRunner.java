package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features" ,
        glue ="stepdefs" ,
        //tags = "@Smoke",
        tags = "@InvalidLogin",
        plugin = {"pretty", "html:Target/cucumber-smoke-report.html"}
)


public class SmokeRunner {

}
