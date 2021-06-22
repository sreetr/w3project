package w3project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class W3Base {
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/sree/eclipse-workspace/w3project/drivers/chromedriver");
		driver = new ChromeDriver();
		
	}

}
