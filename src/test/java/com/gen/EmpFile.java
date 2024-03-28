package com.gen;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
public class EmpFile {
	public static void main(String[] args) throws IOException ,FileNotFoundException
	{   //to display absolute path
		File f= new File("C:\\oracle\\database");
		File[] l = f.listFiles();
		for (File x : l) {
			String a = x.getAbsolutePath();
			System.out.println(a);
		}
		//to read the file
		File f1= new File("C:\\oracle\\database\\table.txt");
		List<String> read = FileUtils.readLines(f1);
		for (String s : read) {
			System.out.println(s);
		}
		
		//to copy the fies
		File f2= new File("C:\\oracle\\database\\table.txt");
		File f3= new File("C:\\oracle\\database\\chair.txt");
		FileUtils.copyFile(f2, f3);
		List<String> r = FileUtils.readLines(f3);
		for (String s1 : r) 
		{
			
		System.out.println(s1);
		}
		
		//to write
		File f4 = new File("C:\\oracle\\database\\besant.txt");
		FileUtils.write(f4, "HelloStudent");
		System.out.println("Its done");
		
	}

}
