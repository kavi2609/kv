package read_write_exl;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import java.io.*;
public class d5 {
	@Test
	public void main() throws IOException
	{
		File f =  new File("C:\\Users\\Admin\\Downloads\\Testcase_MacysProject_Nov11.xlsx");
		FileInputStream n =new FileInputStream(f);
		XSSFWorkbook n1= new XSSFWorkbook(n);
		XSSFSheet n2 = n1.getSheetAt(0);
		
		int d = n2.getLastRowNum();
		System.out.println("number of rows"+d);
		
		int d1 = n2.getRow(1).getLastCellNum();
		System.out.println("number of columns"+d1);
		
		XSSFCell d3 = n2.getRow(8).getCell(4);
		System.out.println(d3);
	}

}
