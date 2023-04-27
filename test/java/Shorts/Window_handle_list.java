package Shorts;


	

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.interactions.Actions;
	public class Window_handle_list {
	
		public static void main(String[] args) throws AWTException, InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sanja\\eclipse-workspace\\New\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
//			String windowHandle = driver.getWindowHandle();
//			System.out.println("first win:"+windowHandle);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
			Actions action = new Actions(driver);
			action.contextClick(mob).perform();
			Robot r1 = new Robot();
			r1.keyPress(KeyEvent.VK_DOWN);
			r1.keyRelease(KeyEvent.VK_DOWN);
			r1.keyPress(KeyEvent.VK_ENTER);
			r1.keyRelease(KeyEvent.VK_ENTER);

			WebElement bs = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
			action.contextClick(bs).perform();
			r1.keyPress(KeyEvent.VK_DOWN);
			r1.keyRelease(KeyEvent.VK_DOWN);
			r1.keyPress(KeyEvent.VK_ENTER);
			r1.keyRelease(KeyEvent.VK_ENTER);

			WebElement E = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
			action.contextClick(E).perform();
			r1.keyPress(KeyEvent.VK_DOWN);
			r1.keyRelease(KeyEvent.VK_DOWN);
			r1.keyPress(KeyEvent.VK_ENTER);
			r1.keyRelease(KeyEvent.VK_ENTER);

			WebElement tw = driver.findElement(By.xpath("(//a[text()='New Releases'])[1]"));
			action.contextClick(tw).perform();
			r1.keyPress(KeyEvent.VK_DOWN);
			r1.keyRelease(KeyEvent.VK_DOWN);
			r1.keyPress(KeyEvent.VK_ENTER);
			r1.keyRelease(KeyEvent.VK_ENTER);

			String M = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";

			Set<String> Allwindow = driver.getWindowHandles();
			for (String s : Allwindow) {

				System.out.println(driver.switchTo().window(s).getTitle());
				if (driver.switchTo().window(s).getTitle().equals(M)) {
					break;
				}
			}

		}}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			



