import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.RunnerClass.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src\\test\\java\\com\\Feature\\Adaction.feature",
glue ="com.Stepdefinition")

public class Adaction_Runner {

	
	public static WebDriver driver;
	
	public static void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanja\\eclipse-workspace\\New\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
	}
	
	
	
	
}
