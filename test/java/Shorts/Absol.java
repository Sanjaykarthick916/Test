package Shorts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absol {
	public static void main(String[] args ) throws InterruptedException, AWTException{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanja\\eclipse-workspace\\New\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	WebElement just = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	just.click();
	
	WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
	username.sendKeys("smart watches");
	Thread.sleep(2000);
	
	
	
	 Robot ro =new Robot();
	 ro.keyPress(KeyEvent.VK_DOWN);
	 ro.keyRelease(KeyEvent.VK_DOWN);
	 
	 ro.keyPress(KeyEvent.VK_ENTER);
	 ro.keyRelease(KeyEvent.VK_ENTER);
	//div[text()='4,999'][1]/preceding-sibling::div[1]  
	// WebElement dyna = driver.findElement(By.xpath("//div[@class='_3I9_wc']/preceding-sibling::div"));
   // dyna.click();
   // JavascriptExecutor js = (JavascriptExecutor)driver;
    //js.executeScript("arguments[0].scrollBy();",dyna);
    
    WebElement dyna = driver.findElement(By.xpath("//div[@class='_3I9_wc']/preceding-sibling::div"));
    dyna.click();
    
    
    
    
    
    
    
    
    
    
    
    
}}
