package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowSer {

	public static void main(String[] args) {


		XSSFWorkbook ExcelWBook = null;
		XSSFSheet ExcelWSheet;
	//	XSSFRow Row;
	//	XSSFCell Cell;
		
		//create an object of file class to open file
		File excelFile = new File("C:\\Users\\91620\\Documents\\datadriven.xlsx");
		FileInputStream inputStream = null;
		//create an object of fileinputstread to read data from file
		try {
			 inputStream = new FileInputStream(excelFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Excel>workbook>sheet>row>cell
		//create object of XSSFworkbook to handle xlsx file
		
		try {
			ExcelWBook = new XSSFWorkbook(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//to access workbook sheet
		ExcelWSheet = ExcelWBook.getSheetAt(0);
		
		//get total row count
		int ttlRows= ExcelWSheet.getLastRowNum() + 1;
		
		//get total number of cells in a row
		int ttlCells=ExcelWSheet.getRow(0).getLastCellNum();
		
		for(int currentRow=1;currentRow<ttlRows;currentRow++)
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91620\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com");
			driver.findElement(By.id("user-name")).sendKeys(ExcelWSheet.getRow(currentRow).getCell(0).toString());
			driver.findElement(By.id("password")).sendKeys(ExcelWSheet.getRow(currentRow).getCell(1).toString());
			driver.findElement(By.id("login-button")).click();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.quit();
		}
		
		try {
			ExcelWBook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
