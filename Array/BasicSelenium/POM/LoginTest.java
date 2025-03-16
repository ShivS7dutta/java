package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91620\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//create object of login page
		LoginPage loginpg=new LoginPage(driver);
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		loginpg.enterUserName("standard_user");
		loginpg.enterPassword("secret_sauce");
		loginpg.clickOnLoginBtn();
	}

}
