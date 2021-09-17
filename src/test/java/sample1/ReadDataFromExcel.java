package sample1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		
      String excelFilePath = ".\\ExcelDataFiles\\Details.xlsx";
      FileInputStream inputstream = new FileInputStream(excelFilePath);
      
      XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
      XSSFSheet sheet = workbook.getSheetAt(0);//XSSFSheet sheet = workbook.getSheet("Sheet1");
      
      int rows = sheet.getLastRowNum();
      int columns = sheet.getRow(1).getLastCellNum();
      
      for(int r=0;r<rows;r++)
      {
    	  XSSFRow row = sheet.getRow(r);
    	  
    	  for(int c=0;c<columns;c++)
    	  {
    		  XSSFCell cell = row.getCell(c);
    		  
    		  switch(cell.getCellType())
    		  {
    		  case STRING: System.out.print(cell.getStringCellValue()); break;
    		  case NUMERIC: System.out.print(cell.getStringCellValue()); break;
    		  case BOOLEAN: System.out.print(cell.getStringCellValue()); break;
    		  }
    		  System.out.print(" | ");
    	  }
    	  System.out.println();
      }
	}

}
