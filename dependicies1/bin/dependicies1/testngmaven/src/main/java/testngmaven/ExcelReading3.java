package testngmaven;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelReading3 {
	public static void main(String[] args) throws BiffException, IOException
	{
		System.out.println(1);
		FileInputStream fis = new FileInputStream("C:\\Users\\kumbh\\Documents\\excelsheetdemo.xlsx");
		System.out.println(2);
		
		Workbook workbook = Workbook.getWorkbook(fis);
		System.out.println(3);
		
		
		Sheet sheet = workbook.getSheet(0);
		System.out.println(4);
		
		int rows = sheet.getRows();
		int colm = sheet.getColumns();
		
		for(int i=0;i<colm;i++)
		{
			for(int j=0;j<rows;j++)
			{
				Cell cell = sheet.getCell(i,j);
				System.out.println(5);
				
				String data= cell.getContents();
				System.out.println(6);
				
				System.out.println("data>>"+data);
				System.out.println();
				
				
				
			}
		}
		
				
		
		
		
	}
	

}
