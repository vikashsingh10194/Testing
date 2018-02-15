package com.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteOperation {
	public static void main(String[] args) throws FileNotFoundException  {

		File f = new File("C:\\Users\\Shivpratap\\Desktop\\Philippines\\TestData\\Philippines");
		FileInputStream fin = new FileInputStream(f);
		Workbook wb = new HSSFWorkbook();
	}
}
