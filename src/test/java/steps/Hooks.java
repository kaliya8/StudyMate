package steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utulities.Driver;
import utulities.Flow;

public class Hooks {


@After
    public void cleanUp(Scenario scenario){
    //I want to check the status of scenario
    //Did it pass or fail?
    System.out.println(scenario.getStatus());
    Flow.wait(1000);
    if(scenario.isFailed()){
        byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());
    }
    Driver.quitBrowser();
}
}
