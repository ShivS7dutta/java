package windowHandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlewindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91620\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		String parent=driver.getWindowHandle();
		System.out.println("Parent window id is "+parent );
		driver.findElement(By.xpath("//a[contains(@href,'http://www.facebook.com') and contains(@target,'_blank')]")).click();
		
		Set<String> allWindows=driver.getWindowHandles();
		System.out.println("all windows id "+allWindows);
		int count=allWindows.size();
		System.out.println("Total windows "+count);
		Thread.sleep(3000);
		for(String child:allWindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				driver.findElement(By.name("q")).sendKeys("selenium");
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		System.out.println("parent window title is "+driver.getTitle());
	}

}
