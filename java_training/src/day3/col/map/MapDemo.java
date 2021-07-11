package day3.col.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import day2.Accountant;
import day2.Developer;
import day2.Employee;
import day2.Project;

public class MapDemo {
	
	public static void main(String[] args) {
		
		Project taxProject = new Project("Tax-File1223", null);
		Project boing = new Project("Boing-App", "SFDC");
		Project fedEX = new Project("Fed-EX", "Java");
		
		
		Map<String, List<Employee>>  empMap = new HashMap<>();
		
		Employee e1 = new Accountant("a1",101, 2000, taxProject);
		Employee e2 = new Accountant("a2",102, 8000, taxProject);
		Employee e3 = new Accountant("a3",103, 5000, taxProject);
		Employee e32 = new Accountant("a4",104, 10000, taxProject);
		
		
		List<Employee> accList = new ArrayList<>();
		accList.add(e1);
		accList.add(e2);
		accList.add(e3);
		accList.add(e32);
		
		
		
		Employee e4 = new Developer("d1",101, 2000, boing);
		Employee e5 = new Developer("d2",101, 2000, boing);
		Employee e6 = new Developer("d3",101, 2000, fedEX);
		
		List<Employee> devList = new ArrayList<>();
		devList.add(e4);
		devList.add(e5);
		devList.add(e6);
		
		
		empMap.put("accounts", accList);
		empMap.put("development", devList);
		
		
		// ----- get All accountant where salary is in b/w 3000-8000
		
		Iterator<String> itr = empMap.keySet().iterator();
		
		while(itr.hasNext())
		{
			
			String departmentName = itr.next();
			
			
			if(departmentName.equals("accounts"))
			{
				List<Employee> employees = empMap.get(departmentName);
				
				for (Employee employee : employees) {
					if(employee.getEmployeeSalary()>=3000 && employee.getEmployeeSalary()<=8000)
					{
						System.out.println(employee);
					}
				}
			}
		}
		
	}//end of main
	
	
	
	
	

}
