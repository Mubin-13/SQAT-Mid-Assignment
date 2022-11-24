package testing.assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	
	public static WebDriver getDriver() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\AIUB\\12th Semester\\SOFTWARE QUALITY TESTING [B]\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
		
	}

}
