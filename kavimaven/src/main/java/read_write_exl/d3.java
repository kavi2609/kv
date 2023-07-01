package read_write_exl;

import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
public class d3 {
	@Test
	public void main() throws IOException
	{
		File f = new File("C:\\Users\\Admin\\Downloads\\Testcase_MacysProject_Nov11.xlsx");
		FileInputStream n =new FileInputStream(f);
		XSSFWorkbook n1= new XSSFWorkbook(n);
		XSSFSheet n2 = n1.getSheetAt(0);
		
		//row count
		int n3=n2.getLastRowNum();
		System.out.println("number of  row"+n3);
		
		//count column 
		int n4=n2.getRow(1).getLastCellNum();
		System.out.println("number of colums"+n4);
		
		//read
		XSSFCell n5 = n2.getRow(7).getCell(4);
		System.out.println("read "+" "+n5);
		
		//write
		n2.getRow(2).createCell(2).setCellValue("personal mail");
		FileOutputStream n6= new FileOutputStream(f);
		n1.write(n6);
	}

}
