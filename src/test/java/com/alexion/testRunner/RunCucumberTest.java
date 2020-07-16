package com.alexion.testRunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

		features = "src/test/resources/features",
		glue     = "com.alexion.stepdefenitions",
		//tags = {"@Important"}, // All scenarios will get execute from feature files
				 tags = {"@Smoke"}, // Only tag with @Smoke scenarios will get execute
				 //tags = {"@Regression"}, //Only tag with @Regression scenarios will get
				// execute
				// tags = {"@Smoke","@Regression"},// Only scenarios those tagged with both
				// @Smoke AND @Regression will get execute.(AND condition)
				// tags = {"@Smoke,@Regression"}, //Only scenarios those tagged with either
				// @Smoke OR @Regression will get execute
	
        strict=true,
		monochrome = true,
		plugin = { "pretty", "html:target/html/AlexionSmoke.html",
				"json:target/json/AlexionSmoke.json", "junit:target/junit/AlexionSmoke.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }

)
public class RunCucumberTest extends AbstractTestNGCucumberTests {

	public static void writeExtentReport() {

	}
}
