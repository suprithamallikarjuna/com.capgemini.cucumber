package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class GiftCardEndToEnd {
	@CucumberOptions(features=
			"E:\\cg-automation-testing\\com.capgemini.cucumber\\features\\GiftCardendtoend.feature",
			glue= {"stepDefination"},
			plugin= {"html:target/cucumber-html-report"})

					
			public class GiftCard extends AbstractTestNGCucumberTests{

			}


}
