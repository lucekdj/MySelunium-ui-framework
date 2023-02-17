package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features" ,
        glue ="stepdefs" ,
        tags = "@CreateNewSaving",
        plugin = {"pretty", "html:Target/cucumber-CreateNewSaving-report.html"}


)



public class CreateNewSavingRunner {
}
