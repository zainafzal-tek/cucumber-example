package step_definitions;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setup(Scenario scenario){
        System.out.println(scenario.getSourceTagNames());
        System.out.println(":::Starting Tests:::");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            byte[] data = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data, "image/png", scenario.getName());
        }
        Driver.closeDriver();
        System.out.println(":::End Of Tests:::");
    }

}
