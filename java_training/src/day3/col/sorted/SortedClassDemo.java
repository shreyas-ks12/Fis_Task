package day3.col.sorted;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import day2.Accountant;
import day2.Employee;

public class SortedClassDemo {

	public static void main(String[] args) {
		
		
		Set<Employee> empSet = new TreeSet<>();
		empSet.add(new Accountant("Ramesh",101, 2100, null));
		empSet.add(new Accountant("Rakesh",112, 4200, null));
		empSet.add(new Accountant("Amit",203, 3200, null));
		empSet.add(new Accountant("Ramesh",14, 1100, null));
		
		
		// default sorting approach 
		doPrint(empSet,"Default Data Rendering ");
		
		
		/* Objective:-  employee based on Salary   */ 
		
		// Step 1: Convert set to list
		List<Employee> salaryBasedList = new ArrayList<>();
		salaryBasedList.addAll(empSet);
		
		//Step 2 :  call collection.sort(list);
		Collections.sort(salaryBasedList, new SortEmployeeBasedOnSalary());
		
		doPrint(salaryBasedList," Sort Data Based on Salary ");
		
		
		
		
		List<Employee> nameBasedList = new ArrayList<>();
		nameBasedList.addAll(empSet);
		
	
		Collections.sort(nameBasedList, new SortBasedOnName());
		
		doPrint(nameBasedList," Sort Data Based on Name ");
		
		
		
		
		
		
	}
	
	public static void doPrint(Collection<Employee> collection,String tagLine)
	{
		System.out.println("\n\n ============"+tagLine+"=========================\n");
		//int x = 10;
		//System.out.println(x); // 10
		for (Employee employee : collection) {
			System.out.println(employee);
		}
	}
}
