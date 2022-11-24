package SQT_sample;



public class Project {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\AIUB\\12th Semester\\SOFTWARE QUALITY TESTING [B]\\IEDriverServer_x64_4.5.0\\IEDriverServer.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");

	}

}
