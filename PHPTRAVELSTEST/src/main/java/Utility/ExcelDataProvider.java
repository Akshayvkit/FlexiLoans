package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider() {

/*	XSSFWorkbook xwb;
	
	public ExcelDataProvider() throws IOException
	{
		File f = new File("C:\\Users\\hp\\eclipse-workspace\\PHPTRAVELSTEST\\src\\main\\java\\TestData\\Tests.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		xwb = new XSSFWorkbook(fis);
		
	}

	public String getStringData(String string, int i, int j) {
		// TODO Auto-generated method stub
		
		return xwb.getSheet(string).getRow(i).getCell(j).getStringCellValue();
	}
	
	*/
	
	public String getStringData(int rowindex, int colindex)
	{


		File f = new File("C:\\Users\\hp\\eclipse-workspace\\PHPTRAVELSTEST\\src\\main\\java\\TestData\\Tests.xlsx");
		FileInputStream fis=new FileInputStream("f");
	   sh = WorkbookFactory.create(fis).getSheet("sheet2");
		
	}
	
}
