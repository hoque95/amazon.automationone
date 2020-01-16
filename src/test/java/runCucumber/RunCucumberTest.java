package runCucumber;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		//features = {"src/test/resources/AllTestFeatures"}, 
		
		//features = {"src/test/java/amazon.automationone.cucumberFeature/test"}, Note: if you wana run one test
		features = {"src/test/java/amazon/automationone/cucumberFeature"},
		glue={"cucumberStepsDeffination","cucumberSupportCode"},
		plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"}, 
		monochrome=true,
		dryRun = false
		//tags = { "@test6"}
		)
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}

