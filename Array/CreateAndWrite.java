package DataDrivenTesting;

import java.io.File;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class CreateAndWrite {

	public static void main(String[] args) throws Exception {
		HSSFWorkbook workbook=new HSSFWorkbook();
		HSSFSheet sheet=workbook.createSheet("TestSheet");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Hello");
		sheet.getRow(0).createCell(1).setCellValue("India");
		
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("Shiv");
		sheet.getRow(1).createCell(1).setCellValue("Testing");
		
		File file=new File("C:\\Users\\91620\\Desktop\\Work Space\\SeleniumPractice\\ExcelFiles\\Test1.xls");
		workbook.write(file);
		workbook.close();


		

	}

}
