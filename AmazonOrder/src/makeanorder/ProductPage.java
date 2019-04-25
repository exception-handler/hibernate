package makeanorder;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ProductPage {
	@Test(priority = 3, enabled = true)
	public static void flow() throws Exception {

		Thread.sleep(1000);


		Setup.getDriver().findElement(By.xpath("//span[@id='pdagDesktopSparkleDescription1']")).click();


		Thread.sleep(9000);

	}
}
