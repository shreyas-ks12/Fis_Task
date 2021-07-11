package p1;

public class DemoClass {
	
	public static void main(String[] args) {
			
		Laptop abc = new Laptop(500);
		int x = 10;
		System.out.println(abc); // toString();
		System.out.println(x);  // 10 
		//abc.ramSize = 1000;
		abc.doProcessing();
		
	}//end main

}//end class
