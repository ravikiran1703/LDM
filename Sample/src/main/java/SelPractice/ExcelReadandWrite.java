package SelPractice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

@Test
public class ExcelReadandWrite {

	public void readExcel() throws IOException {

		Object[][] data = null ;

		try {			
			XSSFWorkbook workbook = new XSSFWorkbook("D:\\Kiran\\New folder\\Vopak 2017 EDD.xls");
			XSSFSheet sheet = workbook.getSheetAt(0);	

			// get the number of rows
			int rowCount = sheet.getLastRowNum();
			// get the number of columns
			int columnCount = sheet.getRow(0).getLastCellNum();

			data = new String[rowCount][columnCount];

			// loop through the rows
			for(int i=1; i <rowCount+1; i++){
				try {
					XSSFRow row = sheet.getRow(i);
					for(int j=0; j <columnCount; j++){ // loop through the columns
						try {
							String cellValue = "";
							try{
								cellValue = row.getCell(j).getStringCellValue();
							}catch(NullPointerException e){

							}
							data[i-1][j]  = cellValue; // add to the data array
						} catch (Exception e) {
							e.printStackTrace();
						}				
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}	
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void writeExcel() throws IOException {
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("qwerety");
		
		FileOutputStream outputStream = new FileOutputStream("newExcel");
		book.write(outputStream);
		
		
	}
}


//workbook.close();


//		XSSFWorkbook workbook = new XSSFWorkbook("D:\\Kiran\\New folder\\Vopak 2017 EDD.xls");
//		XSSFSheet sheets = workbook.getSheet("sheet1");
//		int  rowcount= sheets.getLastRowNum();
//		int colCount = sheets.getRow(0).getLastCellNum();
//
//		Object[][] data = null;
//		data = new String [rowcount] [colCount];
//
//		for (int i = 0; i < rowcount; i++) {
//
//			XSSFRow row = sheets.getRow(i);
//
//			for (int j = 0; j < colCount; j++) {
//				String cel;
//
//				cel = "";
//				cel = row.getCell(j).getStringCellValue();
//				data[i][j] = cel;
//				System.out.println(cel);
//
//			}
//		}





