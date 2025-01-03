package Headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserNotification {
	
	public static void main(String args[]) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\91620\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver= new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://www.justdial.com/");
}
}
