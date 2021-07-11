package day3.task1;

public class AnimalGameApp {
	
	public static void main(String[] args) {
		
		
		Dog d1 = new Dog();
		/*d1.name = "abc";
		d1.age= 9;
		d1.weight = 100;
		
		d1.weight += 2000;*/
		
		d1.setName("abc");
		d1.setAge(9);
		d1.setWeight(10);
		
		System.out.println(d1);
		
		
		Dog d2 = new Dog();
		/*d2.name = "xyz";
		d2.age= 8;
		d2.weight = 80;
		*/
		d2.doFeedAnimal();
		
	}

}
