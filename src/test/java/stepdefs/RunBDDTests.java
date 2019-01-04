package stepdefs;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

/**
 * A sample test to demonstrate
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "stepdefs" }, plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-report.json"}
)
public class RunBDDTests {
    @AfterClass
    public static void writeExtentReport() {



    }
}
