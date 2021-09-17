package sample1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcel {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Cricket Info");
				
	    Object cricketdata[][] = {  {"Jersey NO","Name","Designation"},
	    		                    {"7","Dhoni","All Rounder"},
	    		                    {"18","kohli","Bating"},
	    		                    {"10","Sachin","Bating"},
	    };
		
		int rows = cricketdata.length;
		int columns = cricketdata[0].length;
		
		System.out.println(rows);
		System.out.println(columns);
		
		for(int r=0;r<rows;r++)
		{
			XSSFRow row = sheet.createRow(r);
			
			for(int c=0;c<columns;c++)
			{
				XSSFCell cell = row.createCell(c);
				Object value = cricketdata[r][c];
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}
		
		String filepath = ".\\ExcelDataFiles\\CricketDetails.xlsx";
		FileOutputStream outstream = new FileOutputStream(filepath);
		workbook.write(outstream);
		
		outstream.close();
		
         System.out.println("Cricket details are written successfully");
	}

}
