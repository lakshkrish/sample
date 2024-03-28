
	package test;

	public class Demovarib {
	static int a;//static
	int b= 10;//instance

	public static void main(String[] args) {
		System.out.println("Static variable-"+a);
		
		int c=30;
		System.out.println("Local variable-"+c);
		
		Demovarib d = new Demovarib();
		System.out.println("Instance variable-"+d.b);
	}

	}


