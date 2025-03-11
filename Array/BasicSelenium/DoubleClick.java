package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91620\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://api.jquery.com/dblclick/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		Actions act=new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath("//span[text()='Double click the block']//parent::body/div"))).perform();
		Thread.sleep(5000);
	//	act.doubleClick(driver.findElement(By.xpath("//span[text()='Double click the block']//parent::body/div"))).perform();
      
		
	}

}
