package Shorts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Alldata {
	public static void main(String[] args) throws IOException {
	File f= new File("C:\\Users\\sanja\\eclipse-workspace\\New\\excel\\sanjay.xlsx");
    FileInputStream fis = new FileInputStream(f);
    Workbook wb = new XSSFWorkbook(fis);
    Sheet she = wb.getSheet("sheet1");
    int pnr = she.getPhysicalNumberOfRows();
    for(int i=0; i<pnr;i++)
    {
		Row rw= she.getRow(i);
	int pnc= rw.getPhysicalNumberOfCells();
    
    for(int j=0;j<pnc;j++)
    {
    Cell cl = rw.getCell(j);
    CellType ctp = cl.getCellType();
    
    if(ctp.equals(CellType.STRING)) {             //Condition to check the Data weather its string in excel.
		
		String stringCellValue = cl.getStringCellValue(); //Need to find given celltype stored in stringCellValue
		
		System.out.println(stringCellValue);    //if string is present need to print
	}
	
	else if (ctp.equals(CellType.NUMERIC))
	
	{
		double numericCellValue = cl.getNumericCellValue();
		int name = (int) numericCellValue; //Typecasting Narrowing
		System.out.println(name);
	}
    
    
    
    
    

	}
	}
}}