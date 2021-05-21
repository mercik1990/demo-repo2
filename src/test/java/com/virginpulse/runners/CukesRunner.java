package com.virginpulse.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",


        },

        features = "src/test/resources/features",
        glue = "com/virginpulse/step_definitions",
        dryRun = false,
        tags = "@amazon"
)
public class CukesRunner {}
