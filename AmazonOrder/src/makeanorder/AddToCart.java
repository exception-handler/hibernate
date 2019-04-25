package makeanorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AddToCart {
	@Test(priority = 5, enabled = true)
	
	
	public static void flow() throws Exception {
	/*
		 WebDriver dri = null;
		 dri.get("https://www.amazon.in/Apple-iPhone-6S-Rose-Storage/dp/B01LXF3SP9/ref=sr_1_1?keywords=iphone+6&qid=1554117644&s=gateway&sr=8-1");
		*/
		 
		 Thread.sleep(3000);

		Setup.getDriver().findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

		
		
		Thread.sleep(9000);

	}
}
