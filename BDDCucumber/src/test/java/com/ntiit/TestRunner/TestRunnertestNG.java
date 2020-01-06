package com.ntiit.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestRunnertestNG {
	@CucumberOptions(
			features = {"Features"},
			glue = {"com.ntiit.StepDefs"}
			//tags = {"@userLogIn"}
			)
	public class Testrunner extends AbstractTestNGCucumberTests{}
}

	


