package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class EssentialsEndToEndRunner {
	@CucumberOptions(features=
			"E:\\cg-automation-testing\\com.capgemini.cucumber\\features\\EssentialsEndToEnd.feature",
			glue= {"stepDefination"},
			plugin= {"html:target/cucumber-html-report"})

					
			public class GiftCard extends AbstractTestNGCucumberTests{

			}


}



