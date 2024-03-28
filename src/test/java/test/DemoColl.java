    package test;

	import java.awt.List;
	import java.util.LinkedList; 
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.HashSet;

		public class DemoColl {
			
			public static void main(String[] args) {
				ArrayList lis = new ArrayList();//collections-interface
				lis.add("java");
				lis.add("selenium");
				lis.add("API");
				System.out.println(lis);//printing all elements
				
				Collections.addAll(lis, "python");//collections-class
				System.out.println(lis);
				
				Collections.sort(lis);//collections-class-sorting
				System.out.println(lis);

	}
			
		}


