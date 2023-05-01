package Runner;

import io.cucumber.junit.*;

@org.junit.runner.RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/HU.feature",
        glue = "Steps",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","json:target/cucumber-reports.json"},
        tags = "@API"
)

public class runner {
}
