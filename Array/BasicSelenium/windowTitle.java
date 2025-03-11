package windowHandle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91620\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");	
		System.out.println("first page:" + driver.getTitle());
		
		//new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com");
		System.out.println("Second title:" +driver.getTitle());
		
		//get window handle of open windows
		Set <String> windowhandles=driver.getWindowHandles();
		List <String> handles=new ArrayList<String>();
		handles.addAll(windowhandles);
		
		driver.close();
		driver.switchTo().window(handles.get(0));
		
	}

}
