package p1;

public class ArraysDemo {

	public static void main(String[] args) {
		
		int arr[] = new int[5];

		Laptop laptops[] = new Laptop[3];
		
		for (Laptop laptop : laptops) {

			laptop = new Laptop();
			
			laptop.doProcessing(); // business method 
		}
		
		
	}
}
