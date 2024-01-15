package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "./resources", glue = { "cucumbergr.cucumberar" }, plugin = {
		"html:target/cucumber-reports/cucumber-html-report.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },tags="@prod and not @staging")
public class CucumberCukes extends AbstractTestNGCucumberTests {

}
