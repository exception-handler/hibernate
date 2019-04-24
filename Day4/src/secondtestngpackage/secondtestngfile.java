package secondtestngpackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class secondtestngfile {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";

	public WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}

	@Test
	public void verifyHomepageTitle() {
		
		String Title = driver.getTitle();
		System.out.println(Title);
	}

	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}
}