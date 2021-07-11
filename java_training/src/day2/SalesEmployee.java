package day2;

public class SalesEmployee extends Employee {
	
	public SalesEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalesEmployee(String employeeName, int employeeId, int employeeSalary, Project project) {
		super(employeeName, employeeId, employeeSalary, project);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loginLogoff() {
		System.out.println("login-Logoff is Void ");
	}
	
	
	public void doMarketing(String product)
	{
		System.out.println(" Doing Marketing of "+product);
	}
}
