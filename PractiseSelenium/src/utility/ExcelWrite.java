package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public void excelwrite(int sheetnum, int rownum, int cellnum, String st, int rownum1) throws IOException {
		FileInputStream load = new FileInputStream("E:\\XL Doc\\Excel_Read.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		XSSFSheet sheet = workbook.getSheetAt(sheetnum);
		sheet.getRow(rownum1);
		FileOutputStream input = new FileOutputStream("E:\\XL Doc\\Excel_Read.xlsx");
		sheet.createRow(rownum).createCell(cellnum).setCellValue(st);
		workbook.write(input);
	}
	
	public void excelread(int sheetnum, int rownum, int cellnum) throws IOException {
		FileInputStream load = new FileInputStream("E:\\XL Doc\\Excel_Read.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		XSSFSheet sheet = workbook.getSheetAt(sheetnum);
		String data = sheet.getRow(rownum).getCell(cellnum).getStringCellValue();
		System.out.println(data);
	}
	
	public static void main(String[] args) throws IOException {
		ExcelWrite obj = new ExcelWrite();
		obj.excelwrite(0, 1, 0, "TestNG",1);
		obj.excelread(0, 1, 0);
		obj.excelwrite(0, 1, 1, "Maven",2);
	}
}
