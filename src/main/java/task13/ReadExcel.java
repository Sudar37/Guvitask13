package task13;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

public static void main(String[] args) throws IOException {

		XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\Admin\\eclipse-workspace\\ExcelFileSample\\SampleFile2.xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		String[][] data1= new String[rowCount][columnCount];
		
		// Get into row
		
		for(int i=1;i<=rowCount;i++) {
			
		XSSFRow row = sheet.getRow(i);
			
		// Get into cell
			
		for(int j=0;j<columnCount;j++) {
				
		XSSFCell cell = row.getCell(j);
				
		//read the data from excel
				
		data1[i-1][j] = cell.getStringCellValue(); 
				
		System.out.println(cell.getStringCellValue());	
    }	
}
		
		book.close();	
   }
}
-----------------------------------------------------------------------------------------------------------------
OUTPUT:

ERROR StatusLogger Log4j2 could not find a logging implementation. Please add log4j-core to the classpath. Using SimpleLogger to log to the console...
Mohan
231
25
Banglore
Ram
232
32
Coimbatore
Mano
233
28
Trichy
Sree
234
30
Chennai
Karthick
235
30
Chennai
