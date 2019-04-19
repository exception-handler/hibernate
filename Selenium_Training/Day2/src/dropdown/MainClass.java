package dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class MainClass {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://demo.guru99.com/test/newtours/register.php";

		driver.get(baseURL);

		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");
		// drpCountry.selectByIndex(index);
		// drpCountry.selectByValue(arg0);
		Thread.sleep(5000);
		// Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Thread.sleep(5000);
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		Thread.sleep(5000);
	/*	fruits.selectByIndex(1);
		Thread.sleep(5000);*/
	}
}