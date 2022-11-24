 package testing.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Testing {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Base.getDriver();
		 
		driver.get("http://localhost/Final_Project/view/login.php");
		
        driver.findElement(By.id("username")).sendKeys("19-40715-1");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("Mm01616051126*");
        Thread.sleep(2000);
        driver.findElement(By.name("submit")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("username")).sendKeys("mubin");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("Mm112233@");
        Thread.sleep(2000);
        driver.findElement(By.name("submit")).click();

	}

}
