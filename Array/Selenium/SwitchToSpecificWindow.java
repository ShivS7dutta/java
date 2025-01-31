package windowHandle;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToSpecificWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91620\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

        // Get all window handles
        List<String> windowHandles = List.copyOf(driver.getWindowHandles());

        
        if (windowHandles.size() >= 48) {
            // Switch to the 48th window (index 47 because window handles are 0-based)
            driver.switchTo().window(windowHandles.get(47));
            System.out.println("Switched to window 48");

            // Validate title of the 48th window (you can modify this as needed)
            String pageTitle = driver.getTitle();
            String expectedTitle = "Example Domain"; // Update with your expected title
            if (pageTitle.equals(expectedTitle)) {
                System.out.println("Title validation successful: " + pageTitle);
            } else {
                System.out.println("Title validation failed. Current title is: " + pageTitle);
            }

            
        } else {
            System.out.println("There are less than 48 windows open.");
        }

        
        driver.quit();

	}

}
