package day3.col.sorted;

import java.util.Comparator;

import day2.Employee;

public class SortEmployeeBasedOnSalary implements Comparator<Employee>
{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		return emp1.getEmployeeSalary() - emp2.getEmployeeSalary();
	}
		

}
