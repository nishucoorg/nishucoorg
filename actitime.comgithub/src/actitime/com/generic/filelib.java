package actitime.com.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class filelib {
	public String getpropertydata(String key) throws IOException {
		
	FileInputStream fis = new FileInputStream("./data/data.property");
	Properties p = new Properties();
	p.load(fis);
	String data = p.getProperty(key);
	return data; 
	
	}
	public String getexceldata(String sheetname,int row,int cell )throws IOException {
	
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
  Workbook	wb=WorkbookFactory.create(fis);
  String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
  return data;
}
}