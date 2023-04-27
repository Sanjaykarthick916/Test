package Shorts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read {

	public static void main(String[] args) throws IOException {
		
		File a = new File("C:\\Users\\sanja\\eclipse-workspace\\New\\excel\\sanjay.xlsx");//Create object for file and import excel
		FileInputStream fs = new FileInputStream(a); //Reading the excel data
		Workbook wb =new XSSFWorkbook(fs);			 //Syntax for creating workbook
		Sheet sheet = wb.getSheet("demo");		 //Create a new sheet
		Row r = sheet.getRow(1);					 //Create a new row(using index)
		Cell ce = r.getCell(1);						 //Create a new Column(cell)(using index)
		CellType ct = ce.getCellType();				 //To find which data present in excel.ex(STRING/NUMERIC)
		
		if(ct.equals(CellType.STRING)) {             //Condition to check the Data weather its string in excel.
			
			String stringCellValue = ce.getStringCellValue(); //Need to find given celltype stored in stringCellValue
			
			System.out.println(stringCellValue);    //if string is present need to print
		}
		
		else if (ct.equals(CellType.NUMERIC))
		
		{
			double numericCellValue = ce.getNumericCellValue();
			int name = (int) numericCellValue; //Typecasting Narrowing
			System.out.println(name);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	
}
