package MyRunner;

import MyRunner.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features ={"./src/test/java/features"}, 
		glue = "stepdefinition"
		)
/*,	
 dryRun = true,
		plugin = {"pretty", "html:Reports/report.html",
							"json:Reports/report.json",
							"junit:Reports/report.junit" */
					
		

public class MyRunner extends AbstractTestNGCucumberTests {

}

