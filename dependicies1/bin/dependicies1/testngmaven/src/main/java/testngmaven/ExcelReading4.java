package testngmaven;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelReading4 {
	public static void main(String[] args) throws JXLException, IOException {
		System.out.println(1);
		FileInputStream fis = new FileInputStream("‪C:\\Users\\kumbh\\Documents\\excelsheetdemo.xlsx");
		System.out.println(2);
		
		Workbook workbook = Workbook.getWorkbook(fis);
		
		Sheet sheet = workbook.getSheet(0);
		
		int rows= sheet.getRows();
		 int colm= sheet.getColumns();
		 
		 for(int i=0;i<colm;i++)
			 
		 {
			 for(int j=0;j<rows;j++)
			 {
				 System.out.println();
			 }
		 }
	}

	
}
