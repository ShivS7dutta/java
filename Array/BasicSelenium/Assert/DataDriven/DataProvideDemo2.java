package DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideDemo2 {

	WebDriver driver;
	
	@Test(dataProvider="create")
	public void test(String username,String password)
//This test method takes two parameters: username and password, 
//which will be provided by the @DataProvider.For each set of test 
//data (username and password),the test method runs with the corresponding values.	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91620\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		driver.close();
	}

	@DataProvider(name="create")
//The @DataProvider is a method that returns a 2D Object array with 
//multiple sets of data.In this case, the data provider create provides
//test data for different users(username and password combinations).
//Each row in the Object[][] array corresponds to a set of parameters(username and password) 
//that will be passed to the test method during the test execution.	
	public Object[][] dataset1()
	{
		return new Object[][]
	    {
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"}
	    };

	}
}
