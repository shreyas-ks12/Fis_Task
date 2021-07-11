package day2;

public class Developer extends Employee {
	
	
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Developer(String employeeName, int employeeId, int employeeSalary, Project project) {
		super(employeeName, employeeId, employeeSalary, project);
		// TODO Auto-generated constructor stub
	}

	public void projectDocumentation()
	{
		/*
		String projectName = ;
		if(super.getProject()!=null) projectName = super.getProject().getProjectName();
		*/
		
		String projectName = super.getProject()!=null?super.getProject().getProjectName():"Not Allocated";
		
		System.out.println("Working on Project Documentation.."+projectName);
	}
	
	@Override
	public void loginLogoff() {
		// ... 
		System.out.println("Portal Based Login and Logoff");
	}
}
