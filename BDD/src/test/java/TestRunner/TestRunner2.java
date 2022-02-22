package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {".\\src\\test\\java\\Feature\\homepage.feature"},
		tags = "@regressiontest or @smoketest",
		glue= {"Step_defination"},
		dryRun = true,
		monochrome = true,
		plugin = {"pretty"}
		)

public class TestRunner2 extends AbstractTestNGCucumberTests {
	

}
