package com.alexion.stepdefenitions;

import java.io.IOException;

import com.alexion.basetest.BrowserSetup;
import com.alexion.utils.Logs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OurInspirationTestSteps extends BrowserSetup {
	public OurInspirationTestSteps() throws IOException {
		super();
	}

	@Before
	public void setUp() {
		Logs.startTestCase("OurInspiration Test Feature");
		Logs.info("Starting OurInspiration Scenario Execution.....");
	}

	@Given("^User Alexion WebPage$")
	public void userisonAlexionwebpage() {
		BrowserSetup.launchBrowser();
		Logs.info("Browser Launched......");
	}

	@When("^User clik on Our Inspiration Link$")
	public void userclickOurinspirationlink() throws InterruptedException {
		BrowserSetup.ourInspirationLink();
		Logs.info("Clicked on Inspiration Link......");
	}

	@Then("^Our Inspiration Link should display$")
	public void inspirationlinkdisplay() {
		BrowserSetup.closeBrowser();
		Logs.info("Inspiration Link displayed......");
	}

	@After
	public void tearDown() {
		Logs.info(" OurInspiration Scenario Execution Completed Successfully......");
		Logs.endTestCase("OurInspiration TestFeature");
	}

}
