package day3.col;

import day2.Accountant;

public class EqualsDemo {

	public static void main(String[] args) {
		
		
		Accountant a1 = new Accountant("Ramesh", 101, 100, null);
		Accountant a2 = new Accountant("Rakesh", 101, 100, null);
		Accountant a3 = new Accountant("amit", 103, 100, null);
		Accountant a5 = new Accountant("Varun", 113, 100, null);
		Accountant a6 = new Accountant("Ashish", 107, 100, null);
		
		
		Accountant a4 = a1;
		
		System.out.println(a1);
		System.out.println(a3);
		System.out.println(a2);
		System.out.println(a5);
		System.out.println(a6);
		
		
		
	
		
		
		

		
	}
}
