package com.qa.excelparametisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class WriteToExcel {
	
	@Test
	public void loginTest() throws Exception {
		FileInputStream file = new FileInputStream("Desktop\\DemoSiteDDT.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		XSSFRow row = sheet.getRow(10);
		XSSFCell cell = row.getCell(1);
		if (cell == null) {
			cell = row.createCell(1);
		}
		cell.setCellValue("hello");
			
		FileOutputStream fileOut = new FileOutputStream("Desktop\\DemoSiteDDT.xlsx");

		workbook.write(fileOut);
		
		workbook.close();
		fileOut.flush();
		fileOut.close();
		file.close();		
			
		}


}
