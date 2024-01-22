package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
/*
@CucumberOptions(

        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "",
        monochrome = true,
        dryRun = false,
        plugin ={  "pretty",
                "html:target/cucumber-default-report.html",
                "json:target/cucumber.json"
        }

)

 */
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json",
                "utils.formatter.PrettyReports:target/cucumber-pretty-reports"},
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@Smoke",
        dryRun = false
)
public class TestRunner {

}
