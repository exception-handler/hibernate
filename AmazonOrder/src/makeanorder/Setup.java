package makeanorder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Setup {

	public static WebDriver driver;
	
	public static WebDriver getDriver()
	{
		return driver;
		
	}
	 @BeforeSuite
	    public void beforeSuite () {
	        System.out.println("Launching Browser");
	        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
	    }

	   @AfterSuite
	    public void afterSuite() {
	        System.out.println("Closing Browser");
	      //  driver.quit();
	    }

}
