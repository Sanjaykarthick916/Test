package Shorts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
		File a = new File("C:\\Users\\sanja\\eclipse-workspace\\New\\excel\\sanjay.xlsx");
		FileInputStream fis = new FileInputStream(a);
		Workbook wb = new XSSFWorkbook(fis);
		
		wb.getSheet("sanjay").createRow(0).createCell(0).setCellValue("Karthick");
		wb.getSheet("sanjay").getRow(0).createCell(1).setCellValue("1234");
		
		wb.getSheet("sanjay").createRow(1).createCell(0).setCellValue("Sanjay");
		wb.getSheet("sanjay").getRow(1).createCell(1).setCellValue("9876");
		
		wb.getSheet("sanjay").createRow(2).createCell(0).setCellValue("prabhu");
	    wb.getSheet("sanjay").getRow(2).createCell(1).setCellValue("7728");
	    
	    wb.getSheet("sanjay").createRow(3).createCell(0).setCellValue("MANI");
	    wb.getSheet("sanjay").getRow(3).createCell(1).setCellValue("7728");
		
		FileOutputStream fos = new FileOutputStream(a);
		wb.write(fos);
		
		System.out.println("Completed");
		
	}

}
