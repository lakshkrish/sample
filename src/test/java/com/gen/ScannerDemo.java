package com.gen;

import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Employee Name:");
		String name=s.next();
		System.out.println(name);
		System.out.println("Employee Number:");
	    double num=s.nextDouble();
		System.out.println(num);
		System.out.println("Employee phone number:");
		long phone=s.nextLong();
		System.out.println(phone);
		System.out.println("Employee Age:");
		int age=s.nextInt();
		System.out.println(age);
		System.out.println("Employee Salary:");
		float sal=s.nextFloat();
		System.out.println(sal);
		
		
		
	}

}
