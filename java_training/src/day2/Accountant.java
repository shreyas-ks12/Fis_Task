package day2;

public class Accountant extends Employee {

	
	
	
	public Accountant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Accountant(String employeeName, int employeeId, int employeeSalary, Project project) {
		super(employeeName, employeeId, employeeSalary, project);
		// TODO Auto-generated constructor stub
	}

	public void workOnTaxFile()
	{
		System.out.println("Accountant Working on Tax File ");
	}

	@Override
	public void loginLogoff() {
		System.out.println("Manual Entry for Login and Logoff");
	}
	
	
}
