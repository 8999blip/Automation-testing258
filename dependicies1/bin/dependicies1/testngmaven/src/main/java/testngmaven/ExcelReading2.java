package testngmaven;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelReading2 {
	public static void main(String[] args) throws IOException, Exception {
		
		
		System.out.println(1);
		FileInputStream fis = new FileInputStream("‪C:\\Users\\kumbh\\Documents\\excelsheetdemo.xlsx");
		System.out.println(2);
		
		Workbook workbook = Workbook.getWorkbook(fis);
		System.out.println(3);
		
		Sheet sheet = workbook.getSheet(0);
		System.out.println(4);
		
		Cell cell = sheet.getCell( 0,0);
		
		System.out.println(5);
		
		String data = cell.getContents();
		System.out.println(6);
		
		System.out.println("data>>"+data);
		System.out.println(7);
	}
}
	
	
	  
