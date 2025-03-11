package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91620\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");

		driver.switchTo().frame(0);
		
		WebElement sourceElement=driver.findElement(By.id("draggable"));
		WebElement targetElement=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		
		action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		
	}

}
