package com.alexion.stepdefenitions;

import java.io.IOException;

import com.alexion.basetest.BrowserSetup;
import com.alexion.utils.Logs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OurResearchLinkTestSteps extends BrowserSetup {

	public OurResearchLinkTestSteps() throws IOException{
		super();
	}

	@Before
	public void setUp() {
		Logs.startTestCase("OurResearchLink TestFeature");
		Logs.info("Starting OurResearchLink Scenario Execution.....");
	}

	@Given("^User launched Alexion WebPage$")
	public void userlaunchedAlexionPage() {
		BrowserSetup.launchBrowser();
		Logs.info("Browser Launched......");
	}

	@When("User clik on Our Research Link")
	public void userclickResearchlink() throws InterruptedException{
		BrowserSetup.clickOurResearchLink();
		Logs.info("Clcked on ResearchLink......");
	}

	@Then("Our Research Link should display")
	public void ourResearchlinkDisplay() {
		BrowserSetup.closeBrowser();
		Logs.info("Research Link assertion completed......");
	}

	@After
	public void tearDown() {
		Logs.info(" OurResearchLink Scenario Execution Completed Successfully......");
		Logs.endTestCase("OurResearchLink Test Feature");
	}
}
