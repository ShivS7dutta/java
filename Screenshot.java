package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws Exception {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91620\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		TakesScreenshot capture = (TakesScreenshot)driver;

        File src = capture.getScreenshotAs(OutputType.FILE);
        File target = new File("C:\\Users\\91620\\Pictures\\Screenerweshots97.png");

        FileUtils.copyFile(src,target);
        driver.quit();
		

	}

}
