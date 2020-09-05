package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="Feature",
		glue ="com.stepdef",
		plugin= "pretty",
		tags="@userregister",
		monochrome= true
		)
		

public class TestRunner extends AbstractTestNGCucumberTests{


}

