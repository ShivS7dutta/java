package windowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91620\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/women-casual-shoes");
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//body/div[@id='mountRoot']/div[1]/main[1]/div[3]/div[2]/div[1]/div[2]/section[1]/ul[1]/li[1]/a[1]/div[1]/div[1]/div[1]/div[1]/picture[1]/img[1] "));
		Set<String> handle= driver.getWindowHandles();
		
		//Java Iterator is used to iterate the components of the collection object one by one.

		Iterator<String> it=handle.iterator();
		String parentwindowid=it.next();
		System.out.println("Parent window is this" + parentwindowid);
		
		String childwindowid=it.next();
		System.out.println("Child window is this" + childwindowid);
		
		driver.switchTo().window(childwindowid);

		
		
		String title1=driver.getTitle();
		System.out.println(title1);
	}

}
