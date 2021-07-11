package day3.col;

import java.util.HashSet;
import java.util.Set;

import day2.Accountant;
import day2.Developer;
import day2.Employee;
import day2.SalesEmployee;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(100);
		set.add(10);
		
		System.out.println(set.size()); // 2
		System.out.println(set);
		

		Set<Employee> empSet = new HashSet<>();
		empSet.add(new Accountant("Ramesh",101, 200, null));
		empSet.add(new Accountant("Rakesh",101, 200, null));
		
		empSet.add(new Accountant("Amit",110, 200, null));
		empSet.add(new Accountant("Ramesh",101, 200, null));
		
		System.out.println(empSet.size()); //3
		System.out.println(empSet);
		
		
	}
}
