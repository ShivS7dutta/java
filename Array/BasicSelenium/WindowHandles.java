package windowHandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91620\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentHandle= driver.getWindowHandle();
		System.out.println("Parent window- "+parentHandle);
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> handles=driver.getWindowHandles();
		for (String handle : handles)
		{
			System.out.println(handle);
			if(!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
			driver.findElement(By.id("firstName")).sendKeys("Shivnath");
			Thread.sleep(5000);
			driver.close();
			}
		}
		driver.switchTo().window(parentHandle);
		driver.findElement(By.id("name")).sendKeys("Shub");
		Thread.sleep(2000);
		driver.quit();

	    
	}

}
