package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\features\\test.feature",glue={"stepdefnitions"},monochrome= true,
plugin= {"pretty","html:target/htmlreports/HtmlReports"}
//plugin= {"pretty","json:target/jsonReports/report.json"}
//	plugin= {"pretty","junit:target/jUnit1reports/report.xml"}	
		)
public class runner {

}

