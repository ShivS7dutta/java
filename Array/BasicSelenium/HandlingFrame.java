 package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91620\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("Hello world");
		//switch to frame
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		//select class
		Select courseDD=new Select(driver.findElement(By.id("course")));
		courseDD.selectByVisibleText("Java");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		Thread.sleep(5000);
		driver.findElement(By.id("name")).sendKeys("shivnath");
		
	}

}
