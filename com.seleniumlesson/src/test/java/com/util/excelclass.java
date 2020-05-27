package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelclass {
	XSSFWorkbook  wb;
	
	public excelclass() throws IOException {
	File fil=new File("C:\\seleniumwork\\com.seleniumlesson\\Excel\\Book3.xlsx");	
	FileInputStream file=new FileInputStream(fil);
	  wb=new XSSFWorkbook(file);
		
	}
	
public void data() {
	
	
}


public String getrowdata(String name,int row,int cell) {
	return wb.getSheet(name).getRow(row).getCell(cell).getStringCellValue();
}


public double celldata(String name,int row,int cell) {
	return wb.getSheet(name).getRow(row).getCell(cell).getNumericCellValue();
		
}
}