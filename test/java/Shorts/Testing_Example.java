package Shorts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class Testing_Example {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanja\\eclipse-workspace\\New\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://m.imdb.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		//WebElement username = driver.findElement(By.id("//input[@type='text']"));
		WebElement username = driver.findElement(By.name("q"));
		username.sendKeys("soorarai pottru");
	    Robot ro = new Robot();
	    ro.keyPress(KeyEvent.VK_ENTER);
	    ro.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		TakesScreenshot ts =(TakesScreenshot) driver;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\sanja\\eclipse-workspace\\New\\screen\\sana.png");
		FileUtils.copyFile(sc, des);
		
		
		
		
	}

}
