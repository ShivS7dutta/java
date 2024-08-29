package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DaySize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91620\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		
		WebElement month=driver.findElement(By.id("month"));
		WebElement day=driver.findElement(By.id("day"));
		WebElement year=driver.findElement(By.id("year"));
		
		Select select=new Select(day);
		select.selectByIndex(10);
		System.out.println(select.isMultiple());
		List<WebElement> listDays=select.getOptions();
		System.out.println(listDays.size());
		
//		for(WebElement ele :listDays)
//			System.out.println("check the text :" +ele.getText());
		
	//other method
		for(int i=0;i<listDays.size();i++)
		{
			String daylist=listDays.get(i).getText();
			System.out.println(daylist);
			
			//if need to check specific  value
			if(daylist.equals("10")) {
				listDays.get(i).click();
				break;
			}
		}
	}

}
