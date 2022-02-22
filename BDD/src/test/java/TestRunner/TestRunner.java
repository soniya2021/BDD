package TestRunner;

	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
			features= {".\\src\\test\\java\\feature\\CreateOrg.feature"},
			glue= {"stepDefination_org"},
			dryRun = true,
			monochrome = true,
			plugin = {"pretty"}
			)


	public class TestRunner  extends AbstractTestNGCucumberTests
	{

	}

