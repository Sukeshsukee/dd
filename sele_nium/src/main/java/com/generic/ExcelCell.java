package com.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelCell {

	public String excel(String sheet, int row, int cell) throws InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\suges\\OneDrive\\Documents\\src\\test\\resources\\data\\ExcelBook.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
	
		
	}
	public String uri(String key) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\suges\\OneDrive\\Documents\\src\\test\\resources\\data\\roerties.txt");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
		
	}
	
}
