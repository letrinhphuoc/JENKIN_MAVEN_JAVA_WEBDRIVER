package selenium;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_01_CheckEnvironment {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("http://live.guru99.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void TC_01_CheckCurrentUrl() {
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "http://live.guru99.com/");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Home page");
		
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
