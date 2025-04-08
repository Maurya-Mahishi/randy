package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadTheDataFromEcxel 
{
	@Test
	public void ReadData() throws Exception
	{
		FileInputStream fis = new FileInputStream("./Folder/ExcelData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow row  = sheet.getRow(1);
		XSSFCell cell = row.getCell(0);
		XSSFRow row1  = sheet.getRow(1);
		XSSFCell cell1 = row.getCell(1);
		XSSFRow row2  = sheet.getRow(4);
		XSSFCell cell2 = row2.getCell(1);
		String val = cell.getStringCellValue();
		String val1 = cell1.getStringCellValue();
		String val2 = cell2.getStringCellValue();
		System.out.println(val);
		System.out.println(val1);
		System.out.println(val2);
		workbook.close();
		fis.close();
		
	}

}
