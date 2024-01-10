package definitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.Helper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

//Create the hook class that contains the Before and After hook to initialize the web browser and close the web browser. 
public class Hooks {
 
    @Before
    public static void setUp() {
 
       Helper.setUpDriver();
    }
 
    @After
    public static void tearDown(Scenario scenario) {
 
        //validate if scenario has failed
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Helper.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName()); 
        }   
         
        Helper.tearDown();
    }
}