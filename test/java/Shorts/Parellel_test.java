package Shorts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parellel_test {
	public class Group_testNG {
		@Test(groups="a")
		public void browser1 () throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sanja\\eclipse-workspace\\SeleniumDem\\driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.facebook.com/");
			//Thread.sleep(2000);
			driver.quit();
		}
		@Test(groups="b")
		public void browser2() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sanja\\eclipse-workspace\\SeleniumDem\\driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.instagram.com/");
			//Thread.sleep(2000);
			driver.quit();

}}}
