package RunnerUtility;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="classpath:FeatureFiles/netBanking.feature",
		glue="stepDefinitions",		//package name
		dryRun=false,
		monochrome=true
		)
public class TestNGRunner extends AbstractTestNGCucumberTests{

}
