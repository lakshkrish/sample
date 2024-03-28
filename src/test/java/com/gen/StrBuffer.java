package com.gen;

public class StrBuffer {
	public static void main(String[] args) {
		//dupliate values
		String a="JAVA";
		String b= "JAVA";
		
		System.out.println("IMMUTABLE STRING");
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		String c = a.concat(b);
		System.out.println(c);
		System.out.println(System.identityHashCode(c));
		
		System.out.println();
		
		StringBuffer x1 = new StringBuffer("JAVA");
		StringBuffer x2 = new StringBuffer("JAVA");
		System.out.println("MUTABLE STRING");
		System.out.println(System.identityHashCode(x1));
		System.out.println(System.identityHashCode(x2));
		
		StringBuffer c1 = x1.append(x2);
		System.out.println(c1);
		System.out.println(System.identityHashCode(c1));
		
		System.out.println();
		
	   //Non duplicate value
		String a1 = "Hello";
		String b1 = "Java";
		
		System.out.println("IMMUTABLE STRING");
		System.out.println(System.identityHashCode(a1));
		System.out.println(System.identityHashCode(b1));
		
		String d = a1.concat(b1);
		System.out.println(d);
		System.out.println(System.identityHashCode(d));
		
		System.out.println();
		
		StringBuffer x3 = new StringBuffer("Hello");
		StringBuffer x4 = new StringBuffer("java");
		System.out.println("MUTABLE STRING");
		System.out.println(System.identityHashCode(x3));
		System.out.println(System.identityHashCode(x4));
		
		StringBuffer d1 = x3.append(x4);
		System.out.println(d1);
		System.out.println(System.identityHashCode(d1));
		
		
		
		
	}

}
