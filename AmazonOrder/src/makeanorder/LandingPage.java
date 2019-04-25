package makeanorder;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import makeanorder.Setup;

public class LandingPage {
	@Test(priority = 0, enabled = true)
	public static void flow() throws Exception {

		Thread.sleep(1000);


		Setup.getDriver().findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();

		Thread.sleep(9000);

	}
}
