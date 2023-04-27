package Shorts;

    import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.awt.AWTException;
	import java.awt.Desktop.Action;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;
	public class Robot_arun {
	
		public static void main(String[] args) throws AWTException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanja\\eclipse-workspace\\New\\driver\\chromedriver.exe");
			WebDriver dr = new ChromeDriver();
			dr.get("https://www.amazon.in/");
			System.out.println(dr.getTitle());
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_T);		
			
			
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_SHIFT);
			r.keyPress(KeyEvent.VK_N);
			
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_SHIFT);
			r.keyRelease(KeyEvent.VK_N);
			
			
			
			
		}

	}



