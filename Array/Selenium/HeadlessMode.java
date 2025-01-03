package Headless;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessMode {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91620\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("---headless=new");
		//options.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.flipkart.com");
		System.out.println("Flipkart title:"+driver.getCurrentUrl());
		driver.quit();
		
	}

}
