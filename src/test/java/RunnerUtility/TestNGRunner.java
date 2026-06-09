package RunnerUtility;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="classpath:FeatureFiles/netBanking.feature",
		glue="stepDefinitions",		//package name
		dryRun=false,
		monochrome=true,
		//tags="@DataTableMaps or @DataTableList",
		tags="@DataTableListOfMaps"
		)
public class TestNGRunner extends AbstractTestNGCucumberTests{

}
