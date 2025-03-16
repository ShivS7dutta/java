package AssertTestng;

import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertNotNull {

	@Test
	public void VerifyNotNull()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91620\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Boolean verifyTitle= driver.getTitle().equalsIgnoreCase("Electronics, Cars, Fashion, Collectibles & More | eBay");
		assertNotNull(verifyTitle);
	}
}
