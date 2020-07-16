package com.alexion.stepdefenitions;

import java.io.IOException;

import com.alexion.basetest.BrowserSetup;
import com.alexion.utils.Logs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewsandMediaLinkTestSteps extends BrowserSetup {

	public NewsandMediaLinkTestSteps() throws IOException {
		super();
	}

	@Before
	public void setUp() {
		Logs.startTestCase("NewsandMediaLink Test Feature");
		Logs.info("Starting New and Media Scenario Execution.....");
	}

	@Given("^User is on Alexion Home Page$")
	public void userisonAlexionHomepage() {
		BrowserSetup.launchBrowser();
		Logs.info("Browser launched.....");
	}

	@When("^User  click on NEWS&MEDIA Link$")
	public void userclickonNewsandMedialink() {
		BrowserSetup.clickLink();
		Logs.info("Clicked on News&Media.....");
	}

	@Then("^NEWS&MEDIA page should be displayed$")
	public void newsandmediapageDisplayed() {
		BrowserSetup.assertText();
		Logs.info("News&Media assert done.....");
	}

	@And("^User selects option from NEWS CATEGORY dropdown and Year from YEAR dropdown$")
	public void userselectsCategory() throws InterruptedException  {
		BrowserSetup.selectOptionsFromDropdown();
		Logs.info("User selects data from dropdown.....");
	}

	@When("^User click on Filter button$")
	public void userclickButton() {
		BrowserSetup.clickButton();
		Logs.info("Clicked on Filtered button.....");
	}

	@Then("^User selected Year News should be displayed on the same page$")
	public void userselectsYear() {
		BrowserSetup.closeBrowser();
		Logs.info("Closed the Browser.....");
	}

	@After
	public void tearDown() {
		Logs.info(" New and Media Scenario Execution Completed Successfully.....");
		Logs.endTestCase("NewsandMedia TestFeature");

	}
}
