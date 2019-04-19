package checkboxandradio;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.*;		

public class MainClass {				
    public static void main(String[] args) throws Exception {									
    		
    	// declaration and instantiation of objects/variables		
    	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();				

        driver.get("http://demo.guru99.com/test/radio.html");					
        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));							
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));							
        		
        //Radio Button1 is selected		
        radio1.click();			
        System.out.println("Radio Button Option 1 Selected");		
        Thread.sleep(5000);
        		
        //Radio Button1 is de-selected and Radio Button2 is selected		
        radio2.click();			
        System.out.println("Radio Button Option 2 Selected");					
        Thread.sleep(10000);
        // Selecting CheckBox		
        WebElement option1 = driver.findElement(By.id("vfb-6-0"));							

        // This will Toggle the Check box 		
        option1.click();			

        // Check whether the Check box is toggled on 		
        if (option1.isSelected()) {					
            System.out.println("Checkbox is Toggled On");					
            Thread.sleep(10000);
        } else {			
            System.out.println("Checkbox is Toggled Off");		
            Thread.sleep(10000);
        }		
         
        		
        		
        //Selecting Checkbox and using isSelected Method		
        driver.get("http://demo.guru99.com/test/facebook.html");					
        WebElement chkFBPersist = driver.findElement(By.id("persist_box"));		
        
        for (int i=0; i<2; i++) {											
            chkFBPersist.click (); 			
            Thread.sleep(5000);
            System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());							
        }		
		//driver.close();		
        		
    }		
}
