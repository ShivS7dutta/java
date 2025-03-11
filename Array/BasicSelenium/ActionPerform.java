package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionPerform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91620\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.lambdatest.com/demo");
		driver.manage().window().maximize();		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("prod_type1"))).build().perform();
		//*[text()='Select Product']/following::select
	}

}
