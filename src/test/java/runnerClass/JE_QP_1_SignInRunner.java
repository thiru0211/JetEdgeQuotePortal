package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\thirumaran\\eclipse-workspace\\JetEdgeQuotePortal\\src\\test\\resources\\featureFiles\\JE_QP_1_SignIn.feature",
glue = "stepDefinition",
tags="@TC_07",
plugin = {"pretty","html:Reports/TestReport.html",
		"json:target/cucumber/cucumber.json",
		"html:Reports/cucumber-reports.html"
		})
public class JE_QP_1_SignInRunner {

	
}
