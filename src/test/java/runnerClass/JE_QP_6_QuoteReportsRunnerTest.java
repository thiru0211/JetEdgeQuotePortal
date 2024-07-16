package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\thirumaran\\eclipse-workspace\\JetEdgeQuotePortal\\src\\test\\resources\\featureFiles\\JE_QP_6_QuoteReports.feature",
glue = "stepDefinition",
//dryRun = true,
tags="@TC_04",
plugin = {"pretty","html:Reports/TestReport.html",
		"json:target/cucumber/cucumber.json",
		"html:Reports/cucumber-reports.html"
		})
public class JE_QP_6_QuoteReportsRunnerTest {

	
}
