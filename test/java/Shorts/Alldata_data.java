package Shorts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.collect.Table.Cell;

public class Alldata_data {
	public static void main(String[] args) throws IOException, InterruptedException {
       File f = new File("C:\\Users\\sanja\\eclipse-workspace\\New\\excel\\sanjay.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet("task");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanja\\eclipse-workspace\\New\\driver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://adactinhotelapp.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Row row = null;
		org.apache.poi.ss.usermodel.Cell cell = null;
		String Username = null;
		String Password = null;
		String result = null;

		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			row = sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				cell = row.getCell(j);
				if (j == 0) {
					Username = cell.getStringCellValue();
				}
				if (j == 1) {
					Password = cell.getStringCellValue();
				}
			}
			dr.findElement(By.id("username")).sendKeys(Username);
			dr.findElement(By.id("password")).sendKeys(Password);
			dr.findElement(By.name("login")).click();
			try {
				boolean logout = dr.findElement(By.xpath("//a[text()='Logout']")).isDisplayed();
				if (logout == true) {
					result = "DONE";
				}
				System.out.println(Username + " " + Password + " " + result);
				dr.findElement(By.xpath("//a[text()='Logout']")).click();
			} catch (Exception e) {
				boolean error = dr.findElement(By.xpath("//a[text()='Click here']")).isDisplayed();
				if (error == true) {
					result = "FAIL";
				}
				System.out.println(Username + " " + Password + " " + result);
			}
			dr.findElement(By.xpath("//a[text()='Click here to login again']")).click();
		}

	}


}
