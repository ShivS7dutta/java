package DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DataPrvd {

	WebDriver driver;
	
	
	@BeforeMethod
	public void setup()
	{
		//launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91620\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		
	}
	
	@Test(dataProvider = "searchDataProvider")
	public void searchKeyWord(String keyword)
	{
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys(keyword);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	@DataProvider(name="searchDataProvider")
	public Object[][] searchDataProviderMethod()
	{
		Object[][] searchData = new Object[1][1];//2 row & 1 column
		searchData[0][0] = "Taj Mahal"; //row=1 col=1
		searchData[0][1] = "Kutub Minar";//row=2 & col=1
		return searchData;
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
