
	package test;

	import java.util.Set;
    import java.util.Arrays;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.HashSet;
	//import java.util.Collections;
	import java.util.List;
	import java.util.InputMismatchException;
	import java.util.AbstractSet;

	public class UserDemo {
		public static void main(String[] args)throws InterruptedException {
			Set<Demo> s = new HashSet();
			Demo d= new Demo();
			d.setId(100);
			d.setMobile(97234564);
			d.setName("java");
			d.setSalary(345267.89f);
			
			Demo d1 = new Demo();
			d1.setId(50);
			d1.setMobile(98343456);
			d1.setName("API");
			d1.setSalary(342123.897f);
			
			s.add(d);
			s.add(d1);
			for(Demo demo: s)
			{
				System.out.println(demo.getId());
				System.out.println(demo.getSalary());
				System.out.println(demo.getMobile());
				System.out.println(demo.getName());
			}
			
		}

	}



}
