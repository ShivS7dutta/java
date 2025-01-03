package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void LaunchBrowser(String browser) 
	{
		switch(browser.toLowerCase())
		{
		case "chrome":
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91620\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		break;
		
		//case "medge":
		//	WebDriverManager.edgedriver().setup();
		//	driver=new EdgeDriver();
		//	break;
		
		default:
			driver = null;
			break;
		}
		
	}
	
	@Test
	public void verifyTitle()
	{
		driver.get("http://www.google.com");
		String expected="Google";
		String actual=driver.getTitle();
		
		Assert.assertEquals(expected, actual);
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
}
/*
  <suite name="CrossBrowserSuite">
    <test name="ChromeTest">
        <!-- Passing "chrome" as the browser parameter to the test -->
        <parameter name="browser" value="chrome"/>
        <classes>
            <class name="CrossBrowserTest"/>
        </classes>
    </test>
    <test name="EdgeTest">
        <!-- Passing "medge" as the browser parameter to the test -->
        <parameter name="browser" value="medge"/>
        <classes>
            <class name="CrossBrowserTest"/>
        </classes>
    </test>
</suite>*/
