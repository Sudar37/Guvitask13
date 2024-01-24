package task13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

public static void main(String[] args) throws FileNotFoundException, IOException{
	// TODO Auto-generated method stub

	XSSFWorkbook book = new XSSFWorkbook();
	XSSFSheet sheet = book.createSheet();
			
	Object[][] data = { 
				{"Name","Age","Email"},  
				{"John Doe",30,"john@test.com"},   
				{"Jane Doe",28,"john@test.com"},
				{"Bob Smith",35,"jacky@example.com"}	,
				{"Swapnil",37,"swapnil@example.com"}	
			  };
			
	int rowCount =0;
			
	for(Object[] row1 : data) {
				
	XSSFRow row = sheet.createRow(rowCount++);	
				
	int columnCount=0;
				
	for(Object col : row1) {
					
	XSSFCell cell = row.createCell(columnCount++);
					
	if(col instanceof String) {
	cell.setCellValue((String) col);
	} else if(col instanceof Integer) {
	cell.setCellValue((Integer) col);
     }	
  }
}
			
	try (
	FileOutputStream output= new FileOutputStream("SampleFile1.xlsx"); ) {
	book.write(output);
	}
    } 
 }
---------------------------------------------------------------------------------------------------------------------
OUTPUT:

Write data to an Excel file "SampleFile1.xlsx" successfully.
