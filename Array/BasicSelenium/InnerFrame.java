package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class InnerFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91620\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform();    //Page Down
        System.out.println("Scroll down perfomed");
        Thread.sleep(3000);
     
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		WebElement outerframe=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);
		Thread.sleep(5000);
		WebElement Test=driver.findElement(By.xpath("//*[contains(text(),'Nested iFrames')]"));
		String ActualTitle = Test.getText();
		System.out.println(ActualTitle);
		String ExpectedTitle = "Nested iFrames";
	//	Assert.assertEquals(ActualTitle, ExpectedTitle);
		WebElement innerframe=driver.findElement(By.xpath("//*[text()='Nested iFrames']/parent::div/iframe"));
		driver.switchTo().frame(innerframe);
		System.out.println("ActualTitle1");
		driver.findElement(By.id("text")).sendKeys("shivnam");
		WebElement Test1=driver.findElement(By.xpath("//*[contains(text(),'iFrame Demo')]"));
		String ActualTitle1 = Test.getText();
		System.out.println(ActualTitle1);
		
		

	}

}
