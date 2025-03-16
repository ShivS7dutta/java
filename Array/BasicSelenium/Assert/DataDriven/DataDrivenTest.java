package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class DataDrivenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		
		for(int currentRow=0;currentRow<ttlRows;currentRow++)
		{
			for(int currentCell=0;currentCell<ttlCells;currentCell++)
			{
				System.out.print(ExcelWSheet.getRow(currentRow).getCell(currentCell).toString());
				System.out.print("\t");
			}
				System.out.println();
		}
		try {
			ExcelWBook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
