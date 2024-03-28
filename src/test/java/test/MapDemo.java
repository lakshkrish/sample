package test;

	import java.util.Map;

	import java.util.Set;
	import java.util.Map.Entry;

	public class MapDemo {
		public static void main(String[] args) {
			Map<Integer, Demo> m = new HashMap<Integer, Demo>();
			
			Demo s1 = new Demo();
			s1.setId(500);
			s1.setMobile(921345678);
			s1.setName("Muthu");
			s1.setSalary(12345.89f);
			
			Demo s2 = new Demo();
			s2.setId(300);
			s2.setMobile(753211235);
			s2.setName("lakshmi");
			s2.setSalary(3456790.87f);
			
			m.put(100, s1);
			m.put(200, s2);
			
			Set<Entry<Integer,Demo>> s = m.entrySet();
			for(Entry<Integer, Demo> e : s) {
				System.out.println(e.getKey());
				System.out.println(e.getValue().getId());
				System.out.println(e.getValue().getMobile());
				System.out.println(e.getValue().getSalary());
				System.out.println(e.getValue().getName());
				
				
				
			}
		}

	}




}
