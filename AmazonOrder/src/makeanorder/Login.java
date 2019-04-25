package makeanorder;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import makeanorder.Setup;

public class Login {
	@Test(priority = 1, enabled = true)
	public static void flow() throws Exception {

		Thread.sleep(1000);

		Setup.getDriver().findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("rohit.nain007@gmail.com");
		
		Thread.sleep(1000);

		Setup.getDriver().findElement(By.xpath("//*[@id=\"continue\"]")).click();

		Thread.sleep(1000);

		Setup.getDriver().findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Rohit@10");

		Thread.sleep(1000);

		Setup.getDriver().findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();

		Thread.sleep(9000);

	}
}
