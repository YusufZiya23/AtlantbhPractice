package com.atlantbh.step_definitions;

import com.atlantbh.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before(order = 0) // order = 0 means it will be running first
    public void setupScenario(){
        Driver.getDriver().get("https://shop.demoqa.com/");
    }


    @After
    public void teardownScenario(Scenario scenario){

        if (scenario.isFailed()){ // If scenario fails, take me the screenshot.
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }

        Driver.closeDriver();
    }

}