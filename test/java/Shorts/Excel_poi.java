package Shorts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.sl.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_poi {
	public static void main(String[] args) throws IOException {
		File kar = new File("C:\\Users\\sanja\\eclipse-workspace\\New\\excel\\sanjay.xlsx");
		FileInputStream kan = new FileInputStream(kar);
		Workbook nan = new XSSFWorkbook(kan);
		Sheet sh = nan.getSheet("Sheet1");
	    Row ro = sh.getRow(1);
	    Cell cel = ro.getCell(1);
	    CellType cell = cel.getCellType();
	    
	 
		if(cell.equals(CellType.STRING)) {
			
			String stringCellValue = cel.getStringCellValue();
			System.out.println(stringCellValue);
			
		}
		
		else if(cell.equals(CellType.NUMERIC)){ 	
		double numericCellValue = cel.getNumericCellValue();
		int mk = (int)numericCellValue;
		System.out.println(mk);
			
		}
			
	    
		
		
		
		
	}

}
