package com.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readoperation {
	private static Workbook wn;

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("C:\\Users\\Shivpratap\\Downloads\\TestData.xlsx");
		System.out.println("located");
		FileInputStream f = new FileInputStream(f1);
		wn = new XSSFWorkbook(f);
		Sheet s =  (Sheet) wn.getSheet("Test1");
		
		int rc = ((org.apache.poi.ss.usermodel.Sheet) s).getLastRowNum()-((org.apache.poi.ss.usermodel.Sheet) s).getFirstRowNum();
		
		for (int i = 0; i < rc+1; i++) {

		        Row row = ((org.apache.poi.ss.usermodel.Sheet) s).getRow(i);

		        
		        for (int j = 0; j < row.getLastCellNum(); j++) {

		 

		            System.out.print(row.getCell(j).getStringCellValue()+"|| ");}}
	}

}
