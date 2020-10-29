package com.customer_checkout_UI_tests.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features/",
        glue = "com/customer_checkout_UI_tests/Step_Definitions/",
        dryRun = false,
        tags = "@smoke"
)
public class CukesRunner {
}
