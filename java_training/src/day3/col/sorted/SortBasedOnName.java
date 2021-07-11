package day3.col.sorted;

import java.util.Comparator;

import day2.Employee;

public class SortBasedOnName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmployeeName().compareTo(o2.getEmployeeName());
	}

	
}
