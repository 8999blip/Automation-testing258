package testngmaven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class Excel_Data {

	public static void main(String[] args) throws Exception {
		
		
		
		FileInputStream file= new FileInputStream("C:\\Users\\kumbh\\Documents\\excelsheetdemo.xlsx");
		Workbook wookbook=  Workbook.getWorkbook(file) ;
		Sheet sheet=wookbook.getSheet(0);
		Cell cell=sheet.getCell(0, 0);
		System.out.println(cell);

	}
	
	
}