package Shorts;




import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_class {

	public static WebDriver driver;

	public static void setProperty() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanja\\eclipse-workspace\\New\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	public static void launchUrl(String url) {
		driver.get(url);

	}

//	public static void maxi() {
//		driver.manage().window().maximize();
//
//	}
//
//    public static void clickOnElement(WebElement we) {
//    	we.click();
//    	
//    }
//    
//    public static void scrnShot(String path) throws IOException {
//    	TakesScreenshot ts = (TakesScreenshot) driver;
//    	File source = ts.getScreenshotAs(OutputType.FILE);
//    	File dest = new File(path);
//    	FileUtils.copyFile(source, dest);
// 	
//    }
//    
//    public static void getTitle() {
//    	String title = driver.getTitle();
//    	System.out.println(title);
//    }
//	
//	public static void getCurrentUrl() {
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
//	}
//	
//	public static void navigateTo(String urll) {
//		driver.navigate().to(urll);
//	}
//	
//	public static void alert() {
//		Alert simpleAlert = driver.switchTo().alert();
//		simpleAlert.accept();
//	}
//	public static void frame() {
//		driver.switchTo().frame(0);	
//	}
//	
//	public static void implicitWait() {
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//	}
//	
//	public static void backpage() {
//		driver.navigate().back();
//	}
//	
//	public static void dropdwn(WebElement dd) {
//		Select slct = new Select(dd);
//		slct.selectByIndex(2);
//	}
//	
//	public static void forwardPage() {
//		driver.navigate().forward();
//	}
//	
//	public static void actions(WebElement act) {
//		Actions ac = new Actions(driver);
//		ac.contextClick(act).build().perform();
//		
//	}
//	
//	public static void robotclass() throws AWTException {
//		Robot rt = new Robot();
//		rt.keyPress(KeyEvent.VK_DOWN);               
//	    rt.keyRelease(KeyEvent.VK_DOWN);
//	    rt.keyPress(KeyEvent.VK_ENTER); 
//	    rt.keyRelease(KeyEvent.VK_ENTER);
//		
//	}
//
//

}
