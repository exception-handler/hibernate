package firsttestngpackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class firsttestngfile {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";

	public WebDriver driver;

	@Test
	public void verifyHomepageTitle() {

		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseUrl);
		String Title = driver.getTitle();
		System.out.println(Title);
		// We used the Assert class. The Assert class is used to conduct verification
		// operations in TestNG.
		// To use it, we need to import the org.testng.Assert package.
		 driver.close();
	}
}