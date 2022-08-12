package runnerAndStepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty", "html:target/cucumber-reports.html" },
		features = "src/test/resources/FeatureFiles",
		glue="runnerAndStepdefinition")
public class Runner {

}