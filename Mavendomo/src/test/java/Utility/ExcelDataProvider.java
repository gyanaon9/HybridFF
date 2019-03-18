package Utility;
import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;

	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ExcelDataProvider {
		
		XSSFWorkbook wb;
		public ExcelDataProvider() 
		{
//			Properties prop=new Properties();
//			FileInputStream Fi=new FileInputStream("./TestData/Data.xlsx");
//			prop.load(Fi);
			
			File src=new File("./TestData/Data.xlsx");
			try {
				FileInputStream fis=new FileInputStream(src);
				
				wb=new XSSFWorkbook(fis);
			} catch (Exception e) {
				System.out.println("unable to read Excel file"+e.getMessage());
			
			}
			
		}
	public String getStringData(int  SheetIndex,int row,int col) {
			
			return wb.getSheetAt(SheetIndex).getRow(row).getCell(col).getStringCellValue();
			

	}
		public String getStringData(String SheetName,int row,int col) {
			
			return wb.getSheet(SheetName).getRow(row).getCell(col).getStringCellValue();
			

	}
		public double getNumericData(String SheetName,int row,int col) {
			return wb.getSheet(SheetName).getRow(row).getCell(col).getNumericCellValue();

		}
	}
