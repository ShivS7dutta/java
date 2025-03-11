package windowHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Webtable {

	@Test
	public void verifyTable() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91620\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com");	
		driver.manage().window().maximize();
		List<WebElement> allheader=driver.findElements(By.xpath("//*[@id='customers']//th"));
		System.out.println(allheader.size());
		Assert.assertEquals(allheader.size(),5,"column is not same");
		boolean status=false;
		
		for(WebElement ele:allheader)
		{
			String value=ele.getText();
			System.out.println(value);
			if(value.contains("Country"))
			{
				status=true;
				break;
			}
			
		}
		Assert.assertTrue(status,"Header not present");
		//driver.quit();
		System.out.println("===========");
		List<WebElement> noOfrows=driver.findElements(By.xpath("//*[@id='customers']//tr"));
		System.out.println("total no of rows "+noOfrows.size());
		Assert.assertEquals(noOfrows.size(), 7,"table row mismatch");
		
		System.out.println("=======");
		List<WebElement> alldata=driver.findElements(By.xpath("//*[@id='customers']//td"));
		
		boolean datastatus=false;
		
		for(WebElement ele:alldata)
		{
		   String value=ele.getText();
		   System.out.println(value);
		   if(value.contains("Ola"))
		   {
			   datastatus=true;
			   break;
		   } 
		}
		
		Assert.assertTrue(datastatus,"record not present");
		
		driver.findElement(By.xpath("//*[text()='FlipKart']//preceding-sibling::td//input")).click();
		//click on hyperlink
		
		driver.findElement(By.xpath("//*[text()='Ola']//following::td[3]//a")).click();
		
	}

}
