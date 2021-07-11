package day2;

import java.util.Scanner;

public class UserClass {
	
	
	EmployeeOperation empOperations = new EmployeeOperation();
	
	public static void main(String[] args) {
		
		UserClass app = new UserClass();
		while(true)
		{
			System.out.println(" \n\n================================\n");
			System.out.println("1. Add Employee.");
			System.out.println("2. Read Employee.");
			System.out.println("3. Display All Employee.");
			System.out.println("4. Edit Employee Salary");
			System.out.println("5. Allocate Project");
			System.out.println("6. Get Employees Based on Project Name ");
			System.out.println("7. Login/Logoff");
			
			
			System.out.println(" Enter User Option:- ");
			int choice = new Scanner(System.in).nextInt();
			
			switch(choice)
			{
				case 1:
					app.addEmployee();
					break;
				case 2:
					System.out.println("Enter Employee ID for Details");
					int searchID = new Scanner(System.in).nextInt();
					app.readEmployee(searchID);
					break;
				case 3: 
					app.displayAllEmployees();
					break;
					
				case 4:
					app.doEditSalary();
					break;
				case 5:
					app.allocateProject();
					break;
				case 6:
					app.getEmployyeByProject();
					break;
				case 7:
					app.doLoginLogoff();
					break;
				case 0: 
					System.exit(0);
			}//end switch
			
		}//end while
		
		
	}
	
	
	public void doLoginLogoff()
	{
		System.out.println("\n\n");
		System.out.println("Enter Employee ID forLogin Logout");
		int searchID = new Scanner(System.in).nextInt();
		
		Employee e = empOperations.getEmployeeByID(searchID);
		
		
		if(e!=null)
		{
			e.loginLogoff();
			
		}
		else
		{
			System.out.println(" Wrong Employee ID "+searchID);
		}
		
	}
	
	
	
	
	public void getEmployyeByProject()
	{
		
		System.out.println("Enter Project Name For Employee Details ");
		String searchProjectName = new Scanner(System.in).nextLine();
		
		Employee projectEmpArr[] = empOperations.getEMployeeBasedOnProject(searchProjectName);
		
		for (Employee employee : projectEmpArr) {
			if(employee!=null)
				displayEmployeeDetails(employee);
		}
		
		
	}
	
	
	public void allocateProject()
	{
		System.out.println("Enter Project Name ");
		String projectName = new Scanner(System.in).nextLine();
		
		System.out.println("Enter Techonlogy Name ");
		String techName = new Scanner(System.in).nextLine();
		
		System.out.println("Enter Employee ID for Allocating Project");
		int searchID = new Scanner(System.in).nextInt();
		
		Project p = new Project(projectName, techName);
		
		boolean isProjectAllocated = empOperations.allocateProject(p, searchID);
		if(isProjectAllocated) System.out.println("Project "+p+" Allocated !!!");
		else System.out.println("Wrong Employee ID ");
		
	}
	
	public void doEditSalary()
	{
		System.out.println("Enter Employee ID for Salary Change");
		int searchID = new Scanner(System.in).nextInt();
		System.out.println("Enter New Salary");
		int newSalary = new Scanner(System.in).nextInt();
		
		boolean isSalaryUpdated = empOperations.changeSalary(searchID, newSalary);
		if(isSalaryUpdated) System.out.println("Salary Updated ");
		else System.out.println("Wrong Employee ID ");
	}
	
	public void displayAllEmployees()
	{
		Employee arr[] = empOperations.getArr();
		int employeeCount = empOperations.getIndex();
		
		System.out.println("\n ========== Employee LIST ==========\n");
		
		for (int i = 0; i <employeeCount; i++) {
			displayEmployeeDetails(arr[i]);
		}
	}
	
	public void addEmployee()
	{
		// HTML Form
		
		System.out.println("Enter Employee Name ");
		String empName = new Scanner(System.in).nextLine();
		
		System.out.println("Enter Employee ID ");
		int empID = new Scanner(System.in).nextInt();
		
		System.out.println("Enter Employee Salary ");
		int empSalary = new Scanner(System.in).nextInt();
		
		System.out.println("Enter Employee Type (acc/dev/sales)");
		String empType = new Scanner(System.in).nextLine();
		
		Employee e = null;
		if(empType.equalsIgnoreCase("acc"))
		{
			e = new Accountant(empName, empID, empSalary, null);
		}
		else if(empType.equalsIgnoreCase("dev"))
		{
			e = new Developer(empName, empID, empSalary, null);
		}
		else if(empType.equalsIgnoreCase("sales"))
		{
			e = new SalesEmployee(empName, empID, empSalary, null);
		}
		
		
			
		boolean isInserted = empOperations.insertEmployee(e);
		
		if(isInserted)
		{
			System.out.println("Employee Saved !!");
		}
		else
		{
			System.out.println("Contact to System Admin");
		}
		
	}
	
	public void readEmployee(int employeeID)
	{
		Employee e = empOperations.getEmployeeByID(employeeID);
		if(e != null)
		{
			displayEmployeeDetails(e);
		}
		else
		{
			System.out.println("Wrong Employee ID "+employeeID);
		}
	}

	public void displayEmployeeDetails(Employee e)
	{
		System.out.println("Employee Name "+e.getEmployeeName());
		System.out.println("Employee Salary "+e.getEmployeeSalary());
		System.out.println("Employee ID "+e.getEmployeeId());
		if(e.getProject() == null)
		{
			System.out.println("Project Info :- Not Allocated ");
		}
		else
		{
			System.out.println("Project Info "+e.getProject().getProjectName()+" - "+e.getProject().getTechName());
		}
		
		if(e instanceof Accountant)
		{
			Accountant a = (Accountant)e;  // runtime exception :- classcastexception
			a.workOnTaxFile();
		}
		if(e instanceof SalesEmployee)
		{
			SalesEmployee sales = (SalesEmployee)e;
			sales.doMarketing("ABC-Product");
		}
		
		if(e instanceof Developer)
		{
			Developer dev = (Developer)e;
			dev.projectDocumentation();
		}
		
		
		
		
		
		
		System.out.println("-------------------------------------");
		
	}
	
	
}
