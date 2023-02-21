package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features" ,
        glue ="stepdefs",
        tags = "@Smoke",
        plugin = {"pretty", "html:Target/cucumber-regression-report.html"}
        //plugin = {"html:html-report/report.html","json:target/cucumber.json"}
)
public class TestRunner {


}
