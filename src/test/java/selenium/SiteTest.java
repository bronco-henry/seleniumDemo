package selenium;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SiteTest {

	WebDriver browser;

	@BeforeSuite
	public void beforeTests() {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\senjougahara\\DL\\Nathan\\work\\eclipse\\webDriver\\chromedriver.exe");
		browser = new ChromeDriver();
		browser.get("https://saucelabs.com/");
		browser.manage().window().maximize();
	}

	@Test
	public void test() {


		WebElement href = browser.findElement(By.xpath("//a[@href='https://accounts.saucelabs.com/']"));
		assertTrue((href.isDisplayed()));

	}

	@AfterSuite
	public void closeAll() {
		browser.close();
		browser.quit();
	}

}
