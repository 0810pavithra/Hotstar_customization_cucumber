package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.BrowserManager;

public class Hooks {
    //dependency injection
    private WebDriver driver;
    private BrowserManager browserManager;

    public Hooks(BrowserManager browserManager) {
        this.browserManager = browserManager;
    }

    @Before(order = 0)
    public void setUp() {
       browserManager.setDriver();
    }
    @After(order = 1)
    public void takeScreenShort(Scenario scenario){
        if(scenario.isFailed()){
            TakesScreenshot ts  = (TakesScreenshot) browserManager.getDriver();
            byte[] scr = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(scr, "image/png", "screenshot");
        }

    }
    @After(order = 0)
    public void tearDown() {
       browserManager.getDriver().quit();
    }
}
