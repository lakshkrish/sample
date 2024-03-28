package com.gen;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class EmpUtils {
	public static void main(String[] args) throws IOException {
		//to replace existing word
		File f = new File("C:\\oracle\\database\\besant.txt");
		FileUtils.write(f,"world",false);
		System.out.println("Its done");
		//to add keyword along with existing word
		File f1 = new File("C:\\oracle\\database\\besant.txt");
		FileUtils.write(f1,"world", true);
		System.out.println("Its done");
        //to get the absolute path
		File f3 = new File("C:\\oracle\\database\\besant.txt");
		String path = f3.getAbsolutePath();
		System.out.println(path);
        //to get the file name
		File f4 = new File("C:\\oracle\\database\\besant.txt");
		String fileName = f4.getName();
		System.out.println(fileName);

		
		
		
	}

}
