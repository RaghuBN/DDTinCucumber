package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;		


@RunWith(Cucumber.class)				
@CucumberOptions(
		      features = ".\\Feature\\DDT.feature",
			  glue={"StepDefination"},
			  plugin={"pretty", "html:test-outout", "json:json_output/cucumber.json",
		  				   "junit:junit_xml/cucumber.xml"}, 
			  monochrome = true
			 // strict = true, 
			 // dryRun = false
			  )



public class  Runner {

}
