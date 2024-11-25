import org.openqa.selenium.By;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
public class BrokenLink {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91620\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://example.com"); // Change to your URL

		List <WebElement>links = driver.findElements(By.tagName("a")); 

		// Printing The Total Links Number 
		System.out.println("Total Link Size: " +  
				links.size()); 
		for(int i = 0; i < links.size(); i++) 
		{ 
			// Checking Each & Every Links 
			WebElement element = links.get(i); 

			String url = element.getAttribute("href"); 

			URL link = new URL(url); 
			HttpURLConnection httpConn =  
					(HttpURLConnection) link.openConnection(); 
			httpConn.connect(); 

			// Getting The Response Code 
			int code = httpConn.getResponseCode(); 

			// If The Number Is Greater Than 400,  
			// Then It Is Broken Link 
			if(code >= 400) 
			{ 
				System.out.println("Broken Link: " +  
						url); 
			} 
			else
			{ 
				System.out.println("Valid Link: " +  
						url); 
			}     
		} 

		System.out.println(); 
		System.out.println("All Links Checked"); 

		// Closing The Driver 
		driver.quit();     

	}

}
