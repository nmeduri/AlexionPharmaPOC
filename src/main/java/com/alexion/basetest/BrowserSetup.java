package com.alexion.basetest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BrowserSetup {
	private static WebDriver driver = null;
	public static Properties properties;
	public static final long TIME_WAIT = 20;
	public static final String USER_DIRECTORY = "user.dir";
	public static final String CATCH_BLOCK = "Catchblock";

	public BrowserSetup() throws IOException {
		File file = new File(
				System.getProperty(USER_DIRECTORY) + "\\src\\main\\java\\com\\alexion\\config\\config.properties");
			FileInputStream fis = new FileInputStream(file);
			properties = new Properties();
			properties.load(fis);
	}

	public static void launchBrowser() {
		String browserName = properties.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty(USER_DIRECTORY) + "/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get(properties.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(TIME_WAIT, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(TIME_WAIT, TimeUnit.SECONDS);
		} else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty(USER_DIRECTORY) + "/drivers/IEDriver.exe");
			driver = new InternetExplorerDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get(properties.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(TIME_WAIT, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(TIME_WAIT, TimeUnit.SECONDS);
		}

	}

	public static void clickLink() {
		driver.findElement(By.linkText("News & Media")).click();

	}

	public static void assertText() {
		boolean displayed = driver.findElement(By.xpath("//input[@id='edit-submit']")).isDisplayed();
		Assert.assertEquals(true, displayed);
	}

	public static void selectOptionsFromDropdown() throws InterruptedException {
		driver.findElement(By.xpath("//input[@value='Choose from list']")).click();
		Actions ac = new Actions(driver);
		Thread.sleep(1000);
		WebElement option = driver
				.findElement(By.xpath("//*[@id=\"edit_a0130895_field_nir_news_category_value_chosen\"]/div/ul/li[3]"));
		ac.moveToElement(option).click().build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='chosen-single']")).click();
		Thread.sleep(1000);
		WebElement year = driver.findElement(By.xpath("//*[@id=\"edit_a0130895_year_value_chosen\"]/div/ul/li[5]"));
		ac.moveToElement(year).click().build().perform();

	}

	public static void clickButton() {
		driver.findElement(By.id("edit-submit")).click();
	}

	public static void clickContactUsLink() {
		driver.findElement(By.linkText("Contact Us")).click();

	}

	public static void clickMedicalInfoLink() {
		driver.findElement(By.linkText("Medical Information")).click();
	}

	public static void enterTextBox(String xpath, String testdata) {
		driver.findElement(By.xpath(xpath)).sendKeys(testdata);
	}

	public static void assertLink(String link) {
		boolean displayed = driver.findElement(By.linkText(link)).isDisplayed();
		Assert.assertEquals(true, displayed);
	}

	public static void selectDropdown() {
		Select sel = new Select(driver.findElement(
				By.xpath("//select[@id='wffm77b644cfd63c4ae28f2cdb6a41c929cd_Sections_0__Fields_11__Value']")));
		sel.selectByVisibleText("India");
	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void clickOurResearchLink() throws InterruptedException {
		driver.findElement(By.xpath("//li[@class='ourresearch']")).click();
		Actions ac = new Actions(driver);
		Thread.sleep(1000);
		WebElement option = driver.findElement(By.xpath("//a[text()='Research and Development']"));
		ac.moveToElement(option).click().build().perform();
	}

	public static void ourInspirationLink() throws InterruptedException {
		driver.findElement(By.xpath("//li[@class='ourinspiration']")).click();
		Actions ac = new Actions(driver);
		Thread.sleep(1000);
		WebElement option = driver.findElement(By.xpath("//a[text()='aHUS']"));
		ac.moveToElement(option).click().build().perform();
	}

}
