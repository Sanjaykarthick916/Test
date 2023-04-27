package Shorts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactionProject {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanja\\eclipse-workspace\\Cucum\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("KarthickSanjay");
		Thread.sleep(2000);

		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("2760RY");
		Thread.sleep(2000);

		WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
		login.click();

		Thread.sleep(2000);

		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(location);
		s.selectByValue("Melbourne");
		Thread.sleep(2000);

		WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s1 = new Select(hotel);
		s1.selectByVisibleText("Hotel Sunshine");
		Thread.sleep(2000);

		WebElement room = driver.findElement(By.id("room_type"));
		Select s2 = new Select(room);
		s2.selectByIndex(3);
		Thread.sleep(2000);

		WebElement roomno = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s3 = new Select(roomno);
		s3.selectByValue("3");
		Thread.sleep(2000);

//		WebElement chkin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
//		chkin.clear();
//		chkin.sendKeys("25/03/2023");
//		Thread.sleep(2000);
//		
//		WebElement chkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
//		chkout.clear();
//		chkout.sendKeys("27/03/2023");
		Thread.sleep(2000);

		WebElement adultroom = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adultroom);
		s4.selectByValue("2");
		Thread.sleep(2000);

		WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select s5 = new Select(child);
		s5.selectByIndex(3);
		Thread.sleep(2000);

		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		Thread.sleep(3000);

		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='continue']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Karthick");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Sanjay");
		Thread.sleep(2000);
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		Thread.sleep(2000);
		address.sendKeys("abc 17/10 miller street austraila victoria 87653");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567890123456");
		Thread.sleep(2000);

		WebElement cardtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s8 = new Select(cardtype);
		s8.selectByValue("VISA");
		Thread.sleep(2000);

		WebElement expmonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s9 = new Select(expmonth);
		s9.selectByVisibleText("March");
		Thread.sleep(2000);

		WebElement expyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s10 = new Select(expyear);
		s10.selectByValue("2022");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("765");
		Thread.sleep(2000);

		driver.findElement(By.id("book_now")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='my_itinerary']")).click();
		Thread.sleep(8000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\sanja\\eclipse-workspace\\New\\screen\\adaction.png");
		FileUtils.copyFile(sc, des);

		driver.close();

	}

}
