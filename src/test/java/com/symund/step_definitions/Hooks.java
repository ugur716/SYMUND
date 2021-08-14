package com.symund.step_definitions;

import com.symund.utilities.ConfigurationReader;
import com.symund.utilities.Driver;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

   @Before
   public void setUp(){
       String url= ConfigurationReader.get("url");
       Driver.get().get(url);
       Driver.get().manage().window().maximize();
   }

    @After
    public void tearDown(Scenario scenario) throws InterruptedException {
        if (scenario.isFailed()){
            final  byte[] screenshot=((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        Thread.sleep(1000);
        Driver.closeDriver();
    }
}
