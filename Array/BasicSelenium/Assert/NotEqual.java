package AssertTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotEqual {
	
	@Test
	public void testTitleIsNotEqual()
	{
		
		String expectedtitle="Electronics, Cars, Fashion, Collectibles & More || eBay";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91620\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		String actualtitle=driver.getTitle();
		
		Assert.assertNotEquals(actualtitle, expectedtitle);
		
	}
}
