package read_write_exl;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
public class read {
	
	@Test
	public void main() throws IOException
	{
		//apachi poi,apachi poi ooxml, poo ooxml schama add dependency
		 
		File f = new File("C:\\Users\\Admin\\Downloads\\Final Project- Demoqa.xlsx");
		FileInputStream s1= new FileInputStream(f);
		XSSFWorkbook x =new XSSFWorkbook(s1);
		XSSFSheet d2 = x.getSheetAt(0);
		
		//row count
		int row=d2.getLastRowNum();
		System.out.println("number rows in "+row);
		
		// numbers columns count speifice row 
		int d3 = d2.getRow(0).getLastCellNum();
		System.out.println("number of columns"+d3);
		
		//read particular cell ; know the index row and coulmns count fix 
		//4,2
		XSSFCell d4 = d2.getRow(4).getCell(2);
		System.out.println(d4);
		
		//writing the excel file 
		d2.getRow(0).createCell(6).setCellValue("kavi");
		FileOutputStream n= new FileOutputStream(f);
		x.write(n);
	}

}
