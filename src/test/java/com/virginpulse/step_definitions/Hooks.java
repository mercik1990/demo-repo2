package com.virginpulse.step_definitions;

import com.virginpulse.utilities.Driver;
import io.cucumber.java.*;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before()
    public void setUpScenario() {
        System.out.println("set up browser");
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
    }




    @After
    public void tearDownScenario(Scenario scenario) {

        Driver.closeDriver();
    }




}
