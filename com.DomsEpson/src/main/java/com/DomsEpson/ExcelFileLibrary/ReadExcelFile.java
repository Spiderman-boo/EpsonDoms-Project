package com.DomsEpson.ExcelFileLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelFile {
	public static FileInputStream fis=null;
	public static Workbook wb=null;
	public static FileOutputStream fos=null;
	public static String readSingleData(String sheetname, int row, int cell)
	{
		//1.Convert the physical File into Java Readable File
		try {
				fis = new FileInputStream("./src/test/resources/TestData/Book1.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//2.Create the Workbook using WbookFactory
		try {
			 wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}
		//3.Using Workbook Get the Sheet Control
		//4.Using Sheet Get the Row Control
		//5.Using Row Get the Column Control
		//6.Using Column Get the Cell Data
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	
	public static void readMultipleData(String sheetname)
	{
		//1.Convert the physical File into Java Readable File
				try {
						fis = new FileInputStream("./src/test/resources/TestData/Book1.xlsx");
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				//2.Create the Workbook using WbookFactory
				try {
					 wb = WorkbookFactory.create(fis);
				} catch (EncryptedDocumentException | IOException e) {
					e.printStackTrace();
				}
				//3.Using Workbook Get the Sheet Control
				//4.Using Sheet Get the Row Control
				//5.Using Row Get the Column Control
				//6.Using Column Get the Cell Data
				
				int rowcount = wb.getSheet(sheetname).getLastRowNum();
				for(int i =1;i<rowcount;i++)
				{
					String data = wb.getSheet(sheetname).getRow(i).getCell(1).getStringCellValue();
				}
				
				
				
	}
	
	public static void writeData(String sheetname,int row,int cell,String data)
	{
		//1.Convert the physical File into Java Readable File
				try {
						fis = new FileInputStream("./src/test/resources/TestData/Book1.xlsx");
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				//2.Create the Workbook using WbookFactory
				try {
					 wb = WorkbookFactory.create(fis);
				} catch (EncryptedDocumentException | IOException e) {
					e.printStackTrace();
				}
				//3.Using Workbook Get the Sheet Control
				//4.Using Sheet Get the Row Control
				//5.Using Row create the Column
				//6.Using Column set the Cell Data
				wb.getSheet("Sheetname we will pass").getRow(0).createCell(0).setCellValue("Data we will pass");
				
				//7.Convert Java Readable file into Physical file
				 try {
					fos = new FileOutputStream("./src/test/resources/TestData/Book1.xlsx");
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				 
				//8.Write the data
				try {
					wb.write(fos);
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				//9.Close the WorkBook 
				try {
					wb.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
	}

}
