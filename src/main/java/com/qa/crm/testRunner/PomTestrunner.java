package com.qa.crm.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Shilpa Khandge\\eclipse-workspace\\CucumberPOMDemo\\src\\main\\java\\com\\qa\\crm\\config\\pomlogin.feature", //the path of the feature files
		glue={"com.qa.crm.stepDefinition"},//the path of the step definition files
		plugin= {"pretty","html:test-outout"}, //to generate different types of reporting
		monochrome=true,
		dryRun=false,
		strict=true
		)

public class PomTestrunner {

}
