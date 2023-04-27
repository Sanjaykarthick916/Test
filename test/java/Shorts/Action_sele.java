package Shorts;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_sele {
		public static void main (String[]args) throws AWTException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanja\\eclipse-workspace\\New\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			
			Actions ac = new Actions(driver);
			Robot r=new Robot();
			
		//	WebElement findElement = driver.findElement(By.xpath("//a[@class='button is-primary is-rounded is-small']"));
		//	ac.click(findElement).build().perform();
			WebElement findElement = driver.findElement(By.xpath("//a[@class='button is-primary is-rounded is-small']"));
			ac.click(findElement).build().perform();
			WebElement findElement2 = driver.findElement(By.id("//img[@class='landscape-image'][1])"));
		
		}

}


