package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/Add_Schedule_Recurrences_Automation_Scenarios.feature",
		plugin = {"pretty","json:target/cucumber.json"}, monochrome = true , glue="")
public class TestRunner {
}