package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class LoginRunner {

	@CucumberOptions(features=
			"E:\\cg-automation-testing\\com.capgemini.cucumber\\features\\Login.feature",
			glue= {"stepDefination"},
			plugin= {"html:target/cucumber-html-report"})

					
			public class TestRunner extends AbstractTestNGCucumberTests{

			}




}
