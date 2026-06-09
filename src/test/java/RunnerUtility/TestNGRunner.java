package RunnerUtility;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="classpath:FeatureFiles/netBanking.feature",
		glue="stepDefinitions",		//package name
		dryRun=false,
		monochrome=true,
		//tags="@DataTableMaps or @DataTableList",
		//tags="not @DataTableMaps",
		//tags="@DataTableListOfMaps"
		tags="@CreditLogin or @AdminLogin",		//this is setup with Hooks..
		plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json"}
		)
public class TestNGRunner extends AbstractTestNGCucumberTests{

}
