package com.excelutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutil {
	public String excel_email_address(int a) throws IOException
	{
	FileInputStream fis=new FileInputStream(new File("Demo_opencart.xlsx"));
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	int count = sheet.getLastRowNum();
	System.out.println(count);
	XSSFRow row =sheet.getRow(a);
	XSSFCell cell = row.getCell(0);
	String ea = cell.getStringCellValue();

	return ea;
	}

	public String excel_password(int b) throws IOException
	{
	FileInputStream fis=new FileInputStream(new File("Demo_opencart.xlsx"));
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	int count = sheet.getLastRowNum();
	System.out.println(count);
	XSSFRow row =sheet.getRow(b);
	XSSFCell cell = row.getCell(0);
	String pwd = cell.getStringCellValue();
	return pwd;

	}

}
