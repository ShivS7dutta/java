package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws Exception {
		
		File excelFile = new File("C:\\Users\\91620\\Desktop\\Work Space\\SeleniumPractice\\ExcelFiles\\Test1.xls");
		FileInputStream fis = new FileInputStream(excelFile);
		HSSFWorkbook workbook=new HSSFWorkbook(fis);
		HSSFSheet sheet=workbook.getSheetAt(0);
		String cellValue=sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(cellValue);
		//count total rows
		//int totalRows = sheet.getPhysicalNumberOfRows();
		
		workbook.close();
		fis.close();
	
	}

}
