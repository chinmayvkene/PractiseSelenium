package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaad {

	public void excelread(int sheetnum, int rownum, int cellnum) throws IOException {
		FileInputStream load = new FileInputStream("E:\\XL Doc\\Excel_Read.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		XSSFSheet sheet = workbook.getSheetAt(sheetnum);
		String data = sheet.getRow(rownum).getCell(cellnum).getStringCellValue();
		System.out.println(data);
	}
	
	public static void main(String[] args) throws IOException {
		ExcelReaad obj = new ExcelReaad();
		obj.excelread(0, 0, 0);
		obj.excelread(0, 0, 1);
		obj.excelread(0, 1, 1);
	}
}
