package Shorts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Excel_Alldata {
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\sanja\\eclipse-workspace\\New\\excel\\sanjay.xlsx");
		FileInputStream stream=new FileInputStream(f);
		Workbook s = new XSSFWorkbook(stream);
		org.apache.poi.ss.usermodel.Sheet sheet = s.getSheet("sheet");
		
		int phy = sheet.getPhysicalNumberOfRows();
		
		for (int i = 0; i < phy; i++) {
			Row row = sheet.getRow(i);
			
			int cell = row.getPhysicalNumberOfCells();	
			for (int j = 0; j < cell; j++) {
				
			org.apache.poi.ss.usermodel.Cell cell2 = row.getCell(j);
			CellType ct = cell2.getCellType();
			
			if (ct.equals(CellType.STRING)) {
				
				String stringCellValue = cell2.getStringCellValue();
				System.out.println(stringCellValue);
			}else if (ct.equals(CellType.NUMERIC)) {
				
				double numericCellValue = cell2.getNumericCellValue();
				System.out.println(numericCellValue);
			}else {
				System.out.println("no match");
			}
		}
			
		}
	}

}
