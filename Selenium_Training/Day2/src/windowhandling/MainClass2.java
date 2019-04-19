package windowhandling;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainClass2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launching the site.
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		String MainWindow = driver.getWindowHandle();
		System.out.println(MainWindow);
		Thread.sleep(5000);
		String childWindow = driver.getWindowHandle();
		Thread.sleep(5000);
		System.out.println(childWindow);
		
		driver.switchTo().window(MainWindow);
		
	}
}