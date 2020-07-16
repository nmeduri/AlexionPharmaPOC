package com.alexion.stepdefenitions;

import java.io.IOException;

import com.alexion.basetest.BrowserSetup;
import com.alexion.utils.Logs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsLinkTestSteps extends BrowserSetup {

	public ContactUsLinkTestSteps() throws IOException{
		super();
	}

	public static final String FIRST_NAME = "//input[@id='wffm77b644cfd63c4ae28f2cdb6a41c929cd_Sections_0__Fields_1__Value']";
	public static final String LAST_NAME = "//input[@id='wffm77b644cfd63c4ae28f2cdb6a41c929cd_Sections_0__Fields_2__Value']";
	public static final String E_MAIL = "//input[@id='wffm77b644cfd63c4ae28f2cdb6a41c929cd_Sections_0__Fields_3__Value']";
	public static final String AREAOF_INT = "//input[@id='wffm77b644cfd63c4ae28f2cdb6a41c929cd_Sections_0__Fields_14__Value']";
	public static final String PROD_ID = "//input[@id='wffm77b644cfd63c4ae28f2cdb6a41c929cd_Sections_0__Fields_15__Value']";
	public static final String INQ_ID = "//textarea[@id='wffm77b644cfd63c4ae28f2cdb6a41c929cd_Sections_0__Fields_16__Value']";
	public static final String CONTACT_LINK = "Alexion.com/EthicsHotline";
	public static final String MINFO_LINK = "a[href*='/contact-alexion'][class*=link]";

	@Before
	public void setUp() {
		Logs.startTestCase("ContactUsLink TestFeature");
		Logs.info("Starting ContactUsLink Scenario Execution.....");

	}

	@Given("^User is on Alexion HomePage$")
	public void userHomePage() {
		BrowserSetup.launchBrowser();
		Logs.info(properties.getProperty("Browser") + "....." + "Browser Launched:");
	}

	@When("^User  click on ContactUs Link$")
	public void userclickContactUsLink() {
		BrowserSetup.clickContactUsLink();
		Logs.info("Clicked on Contact us Link.....");
	}

	@Then("^ContactUs screen shoud display$")
	public void contactusscreenDisplay() {
		BrowserSetup.assertLink(CONTACT_LINK);
		Logs.info("Contact us link available.....");
	}

	@When("^User  click on MedicalInformation Link$")
	public void userclickMedicalInformationLink() {
		BrowserSetup.clickMedicalInfoLink();
		Logs.info("Click on MediaInformation Link.....");
	}

	@Then("^User enters \"([^\"]*)\" in the firstname field$")
	public void userentersFirstname(String firstname) {
		BrowserSetup.enterTextBox(FIRST_NAME, firstname);
		Logs.info("First Name field entered.....");
	}

	@Then("^User enters \"([^\"]*)\" in the lastname field$")
	public void userentersLastname(String lastname) {
		BrowserSetup.enterTextBox(LAST_NAME, lastname);
		Logs.info("Last Name field entered.....");
	}

	@Then("^User enters \"([^\"]*)\" in the email field$")
	public void userentersEmail(String email) {
		BrowserSetup.enterTextBox(E_MAIL, email);
		Logs.info("Email field entered.....");
	}

	@Then("^User selects country from dropdown$")
	public void userselectsCountry() {
		BrowserSetup.selectDropdown();
		Logs.info("Dropdown value selected.....");
	}

	@Then("^User enters \"([^\"]*)\" in area of interest filed$")
	public void userentersAreaofInterest(String areaOfinterest) {
		BrowserSetup.enterTextBox(AREAOF_INT, areaOfinterest);
		Logs.info("Area of Interest field entered.....");
	}

	@Then("^User enters \"([^\"]*)\" in the product field$")
	public void userentersProduct(String product) {
		BrowserSetup.enterTextBox(PROD_ID, product);
		Logs.info("Product field entered.....");
	}

	@Then("^User enters  \"([^\"]*)\" in inquiry$")
	public void userentersInquiry(String inquiry) {
		BrowserSetup.enterTextBox(INQ_ID, inquiry);
		Logs.info("Inquiry field entered.....");
	}

	@Then("^User click on submit button$")
	public void userclickSubmit() {
		BrowserSetup.closeBrowser();
		Logs.info("User Clicked on Submit button and close the browser.....");
	}

	@After
	public void tearDown() {
		Logs.endTestCase("ContactUs TestFeature");
		Logs.info("ContactUsLink Scenario Execution Completed Successfully.....");
	}
}
