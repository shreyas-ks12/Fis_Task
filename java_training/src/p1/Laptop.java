package p1;

public class Laptop {

	private int ramSize;
	private int cores;
	
	
	// default or no-arg constructor
	public Laptop() {
		System.out.println("Constructor");
		ramSize = 1000;
	}
	
	// 
	public Laptop(int ram) {
		System.out.println("Constructor-int arg");
		ramSize = ram;
	}
	
	
	
	public void doProcessing()
	{
		// code 100 lines
		
		System.out.println("Laptop do-processing called RamSize "+ramSize);
		
	}
}
