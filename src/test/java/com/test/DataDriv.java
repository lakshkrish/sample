package com.test;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.NoSuchElementException;




public class DataDriv {
 public static void main(String[] args)throws IOException,NoSuchElementException {
	 File f=new File("C:\\Users\\mailm\\eclipse-workspace\\mavendemo\\src\\testdata\\datadriven.xlsx");
	 System.out.println("file opened");
	 FileInputStream s=new FileInputStream(f);
	 Workbook w = new XSSFWorkbook(s);
	 Sheet s1=w.getSheet("Sheet1");
	 Row r=s1.getRow(1);
	 Cell c=r.getCell(1);
	 System.out.println(c);
	 
	 
 }
}
