package Shorts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

//import java.awt.AWTException;
//import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.ScreenshotException;

public class Scn_mvn {


	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanja\\eclipse-workspace\\New\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	TakesScreenshot image=(TakesScreenshot)driver;
	File screenshotAs = image.getScreenshotAs(OutputType.FILE);
	File src=new File("C:\\Users\\sanja\\eclipse-workspace\\New\\screen\\sanjay.png");
	FileUtils.copyFile(screenshotAs, src);
	
	
		
		

}}

	