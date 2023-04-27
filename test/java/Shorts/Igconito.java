package Shorts;

    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	public class Igconito {
		
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", 
			 "C:\\Users\\sanja\\eclipse-workspace\\New\\driver\\chromedriver.exe");
			 ChromeOptions a = new ChromeOptions();
			 a.addArguments("--incognito");
			 a.addArguments("--start-maximized");
			 
			 WebDriver dr = new ChromeDriver(a);
			 dr.get("https://www.amazon.in/");
			 String currentUrl = dr.getCurrentUrl();
			 System.out.println(currentUrl);
			 dr.quit();
		}

	}


