package usingxpath;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicXPath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;//WebDriver is an interface it provide all the methods for your automation
		
		System.out.println("Launching Browser");
		//webdriver.chrome.driver is a property that is to be set with chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");//to invoke the browser
		//browsers are third party applications so to invoke them we need to set property
		//invoke .exe file for the specific browser .
		//these exe files are not developed by selenium these are given by the browser to connect with selenium.
		driver = new ChromeDriver(); 
		
		driver.get("http://demo.guru99.com/v1/");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("Hello");
		
		
	
	}

}
