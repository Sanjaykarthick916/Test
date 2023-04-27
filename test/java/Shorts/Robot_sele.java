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

public class Robot_sele {
	///----->KeyPress,KeyRelease----->KeyEvents---->Is a class and it performs the KeyBoard Function
		public static void main(String[] args) throws AWTException, InterruptedException, IOException {//Syntax------>Robot r=new Robot();//r.keyPress(KeyEvent.anyfunction)//r.keyRelease(keyEvent.anyFunction) vk-VirtualKey
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sanja\\eclipse-workspace\\New\\driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver(); 
			driver.get("https://www.swiggy.com/");
			driver.manage().window().maximize();
			
			WebElement location= driver.findElement(By.xpath("//input[contains(@placeholder,'Enter')]"));
			location.sendKeys(" new munish");
			//WebElement search= driver.findElement(By.xpath("//span[contains(text(),Search)])[14]"));
			//search.click();
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
			WebElement muni= driver.findElement(By.xpath("//span[contains(text(),'Vinayakapuram')]"));
			muni.click();
			WebElement input= driver.findElement(By.xpath("//span[contains(text(),'Search')]"));
			input.click();
			WebElement srch= driver.findElement(By.xpath("//input[contains(@type,'text')]"));
			srch.sendKeys("briyani");
			WebElement briyani= driver.findElement(By.xpath("//div[contains(text(),'Biryani')][1]"));
			briyani.click();
			WebElement add= driver.findElement(By.xpath("//div[contains(text(),'ADD')][1]"));
			add.click();
			WebElement item= driver.findElement(By.xpath("//span[contains(text(),'Add Item')]"));
			item.click();
			
			WebElement cart = driver.findElement(By.xpath("//span[text()='Cart']"));
			cart.click();
		    TakesScreenshot ts =(TakesScreenshot) driver;
			File sc = ts.getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\Users\\sanja\\eclipse-workspace\\New\\screen\\rohi.png");
			FileUtils.copyFile(sc, des);
}}
