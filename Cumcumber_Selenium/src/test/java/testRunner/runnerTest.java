package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/Features",
glue= {"testSteps"},
plugin = {"pretty", "json:target/report.json"}, 
monochrome = true
)

public class runnerTest {
}