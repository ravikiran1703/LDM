package SelPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excelUnlock {
@Test

	public  void readCreds() throws IOException{
		//go to the excel workbook
			XSSFWorkbook wBook = new XSSFWorkbook("D:\\Kiran\\ABL_ReagentPreparation_Column_Arrangement.xlsx");
			
			
			//go to the sheet

			
		  XSSFSheet	wSheet= wBook.getSheet("sheet1");
	
			//find row count of sheet without considering header
			int rowCount = wSheet.getLastRowNum();
			System.out.println("No. of rows are "+rowCount);
			//to get row count including header row
			int rcWithHeader = wSheet.getPhysicalNumberOfRows();
			System.out.println("No. of rows with header are "+rcWithHeader);
			//find the column count
			short colCount = wSheet.getRow(rowCount).getLastCellNum();
			System.out.println("No. of columns are "+colCount);
			//Go to each cell of each row and read the data
			String[][] credsData= new String[rowCount][colCount];
			for(int i=1;i<=rowCount;i++)
			{
				//go to the each row
				XSSFRow wRow = wSheet.getRow(i);
				for (int j=0;j<colCount;j++)
				{
					//go to the each cell of each row
					XSSFCell wCell = wRow.getCell(j);
					try {
						credsData[i][j]= wCell.getStringCellValue();
					//	System.out.println("Cell Value: "+ credsData.toString());
					} catch (Exception e) {
						credsData[i-1][j]="";
					}
					System.out.println("the value of row "+i+" and column "+j+" is "+credsData);
				}
				//System.out.println("Cell Value: "+ credsData.toString());
			}
			wBook.close();

				}
    }



