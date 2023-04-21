package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	
	public static void intialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\eclipse-workspace\\com.patona\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().window().maximize();
		 driver.get("https://www.intelligencebank.com/contact-us/");
		 driver.findElement(By.xpath("//a[@id='cookie_action_close_header']")).click();
		 driver.manage().deleteAllCookies();
		 
		 
		
		
		
	}

}
