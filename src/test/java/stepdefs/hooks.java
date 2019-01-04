package stepdefs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class hooks {
    public byte[] extractBytes (String imageName) throws IOException {
        return Files.readAllBytes(new File(imageName).toPath());
    }
    @After
    public void printstatus(Scenario scenario) {
        System.out.println(scenario.getName() + scenario.getStatus());

    }

    //@AfterClass
    //public void quitsession() {
        //Main.driver.quit();
    //}


    @After
    public void afterscenario(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) Main.driver;
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");

        }
    }
}
