import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.util.List;
public class BrokenLink {

public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
    WebDriver driver = new ChromeDriver();

     driver.get("http://example.com"); // Change to your URL

      List<WebElement> links = driver.findElements(By.tagName("a"));
      for (WebElement link : links) {
           String url = link.getAttribute("href");
            if (url != null && !url.isEmpty()) {
                checkLink(url);
            }
        }
        driver.quit();
    }

 private static void checkLink(String url) throws Exception {
    try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
        HttpResponse response = httpClient.execute(new HttpGet(url));
        int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode >= 400) {
                System.out.println("Broken link: " + url + " - Status code: " + statusCode);
            } else {
                System.out.println("Valid link: " + url + " - Status code: " + statusCode);
            }
        }

	}

}
