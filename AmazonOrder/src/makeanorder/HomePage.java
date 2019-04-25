package makeanorder;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePage {
	@Test(priority = 2, enabled = true)
	public static void flow() throws Exception {

		Thread.sleep(1000);

		File src = new File("C:\\New folder\\Data.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);// workbook class will load complete excel sheet . Used with xlsx file

		XSSFSheet sheet1 = wb.getSheet("Sheet1");// to fetch the sheet

		String data = sheet1.getRow(0).getCell(0).getStringCellValue();// to fetch the data

		System.out.println(data);// data of a specific cell

		wb.close();

		Setup.getDriver().findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(data);

		Thread.sleep(1000);

		Setup.getDriver().findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();

		Thread.sleep(9000);

	}
}
