package day3.col;

import java.util.ArrayList;
import java.util.List;

import day2.Accountant;
import day2.Developer;
import day2.Employee;
import day2.SalesEmployee;
import p1.Laptop;

public class GenericCollectionDemo {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(20);
		list1.add(15);
		list1.add(10);// Integer
		list1.add(new Integer(200));
		
		
		List<Employee> empList = new ArrayList<>();
		
		
		empList.add(new Accountant("Mike",101, 200, null));
		empList.add(new Developer());
		empList.add(new SalesEmployee());
	//	empList.add(new Object());
		
		
		new MainClass1().doPrint(empList);
		
		
		
	}
}
