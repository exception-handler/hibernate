package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;//WebDriver is an interface it provide all the methods for your automation
		
		System.out.println("Launching Browser");
		//webdriver.chrome.driver is a property that is to be set with chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");//to invoke the browser
		//browsers are third party applications so to invoke them we need to set property
		//invoke .exe file for the specific browser .
		//these exe files are not developed by selenium these are given by the browser to connect with selenium.
		driver = new ChromeDriver(); 
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		Thread.sleep(10000);
		
		driver.findElement(By.id("email")).sendKeys("rohit");
		
		
		//1.System.out.println(driver.getPageSource());
		//2.System.out.println(driver.getCurrrentUrl));
		//3.driver.naviagte().back();
		//4.driver.navigate().forward();
		//5.driver.close();//to close the tab
		//6.driver.quit();//to close the window child and parents
	}

}
