package Frame;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91620\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(3000);
		List<WebElement> iframes = driver.findElements(By.xpath("//iframe"));
        System.out.println("Number of iframe : " + iframes.size());
        List<WebElement> framese = driver.findElements(By.tagName("iframe"));
        System.out.println("Number of iframe : " + framese.size());


        // Count the number of <frame> elements
        List<WebElement> frames = driver.findElements(By.tagName("frame"));
        System.out.println("Number of frame : " + frames.size());

        // Close the WebDriver
        driver.quit();
	}

}
