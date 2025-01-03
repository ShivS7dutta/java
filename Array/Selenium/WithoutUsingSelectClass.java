package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutUsingSelectClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91620\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		List<WebElement> Daylist=driver.findElements(By.xpath("//*[@name='birthday_day']//option"));
		System.out.println(Daylist.size());
		
		for(int i=0;i<Daylist.size();i++)
		{
			System.out.println(Daylist.get(i).getText());
			if(Daylist.get(i).getText().equals("26")) {
				Daylist.get(i).click();
				break;
			}
		}	

	}

}
