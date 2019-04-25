package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectTest {
	
	public static void main(String[] args) throws Exception {
		String text="";
		String address="";
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");// driver load
			Connection con = DriverManager.getConnection// connection build with database
			("jdbc:oracle:thin:@localhost:1521:oracle", "HR", "hr");

			Statement statement = con.createStatement();// execute query
			ResultSet res = statement.executeQuery("Select * from selenium");// result set take data
			// executeQuery give result set
			while (res.next()) {
				address = res.getString(2);
				System.out.println(res.getString(1) + " -> " + res.getString(2));

			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		WebDriver driver;// WebDriver is an interface it provide all the methods for your automation

		System.out.println("Launching Browser");
		// webdriver.chrome.driver is a property that is to be set with chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");// to invoke the browser
		
		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		text = driver.findElement(By.xpath("//a[contains(text(),'Australia')]")).getText();
		System.out.println(text);
		Thread.sleep(1000);
		System.out.println(address);
		
		if(address.equals(text))
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Failed");
		}

	}

}