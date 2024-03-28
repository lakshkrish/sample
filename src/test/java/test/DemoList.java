package test;

//import java.awt.List;
//import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.TreeSet;

public class DemoList {
	public static void main(String[] args) {
		//ArrayList li = new ArrayList();
		
		//li.add('a');
		//li.add(20);
		//li.add("Java");
		//li.add(40);
		//li.add(500.2345);
		//li.add(20);
		
		//System.out.println(li);
		//to add values
		//li.add(3,"oracle");
		
		//to remove any value
		//li.remove(3);
		//system.out.println(li);
		
	//to replace any value
		//li.set(3,"API");
		//system.out.println(li);
		//Set s = new HashSet();//never allow duplicate
		//s.add(60);
		//s.add(45);
		//s.add(89);
		//s.add(99);
		
		//for enhanced loop
		//for(Object o : s) {
			//System.out.println(o);
		//}
		Map<Integer, String > m = new HashMap<Integer, String>();
		m.put(100, "Java");
		System.out.println(m);
		m.values();//print only values
		Set <Integer> k=m.keySet();//to print key
		System.out.println(k);
		Set<Entry<Integer,String>> e = m.entrySet();//to iterate in map
		for(Entry<Integer,String> x:e) {
			System.out.println(x);
		}
	}

}
