package com.gen;

import java.io.File;
import java.io.IOException;

public class Emp {
	public static void main(String[] args) throws IOException {
		File f= new File("C:\\oracle");
		boolean a = f.mkdir();
		System.out.println(a);
		
		File f1= new File("C:\\oracle\\database\\t.txt");
		boolean b = f1.createNewFile();
		System.out.println(b);
		
		File f2= new File("C:\\oracle\\database\\t.txt");
		boolean c = f2.isDirectory();
		System.out.println(c);
		
		File f3= new File("C:\\oracle\\database\\t.txt");
		boolean d = f3.canRead();
		System.out.println(d);
		
		File f4= new File("C:\\oracle\\database\\t.txt");
		boolean e = f4.canWrite();
		System.out.println(e);
		
		File f5= new File("C:\\oracle\\database\\t.txt");
		boolean g = f5.exists();
		System.out.println(g);
		
		File f6= new File("C:\\oracle\\database\\table.txt");
		boolean h = f6.isHidden();
		System.out.println(h);
		
		
		
		
		
		
	}

}
