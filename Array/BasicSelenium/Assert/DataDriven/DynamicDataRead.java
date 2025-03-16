package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class DynamicDataRead {

	public static void main(String[] args) throws Exception {
		File excelFile = new File("C:\\Users\\91620\\Desktop\\Work Space\\SeleniumPractice\\ExcelFiles\\Test1.xls");
		FileInputStream fis = new FileInputStream(excelFile);
		HSSFWorkbook workbook=new HSSFWorkbook(fis);
		HSSFSheet sheet=workbook.getSheetAt(1);
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		
		for(int i=0;i<rowCount;i++)
		{
			HSSFRow row=sheet.getRow(i);
			
			int cellCount=row.getPhysicalNumberOfCells();
			for(int j=0;j<cellCount;j++)
			{
				HSSFCell cell=row.getCell(j);
				String cellValue= getCellValue(cell);
				System.out.print("||"+cellValue);
				
			}
			System.out.println();
					
		}
		workbook.close();
		fis.close();
		

	}

	public static String getCellValue(HSSFCell cell) {
		switch(cell.getCellType()) {
		case NUMERIC:
			return String.valueOf(cell.getNumericCellValue());
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
		case STRING:
			return cell.getStringCellValue();
		default:
			return cell.getStringCellValue();
		}
		
	}

}
