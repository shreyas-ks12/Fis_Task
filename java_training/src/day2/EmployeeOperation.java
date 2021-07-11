package day2;

// Replacve with Server Code 

public class EmployeeOperation {

	// replace with Database
	Employee arr[] = new Employee[1000];
	// collection unlimitted data
	int index = 0;

	// method in Server to save Employee
	public boolean insertEmployee(Employee e) {
		// replace SQL insert Query
		arr[index++] = e;
		return true;
	}

	// 102
	public Employee getEmployeeByID(int searchId) {
		for (int i = 0; i < index; i++) {

			// null.getEmployeeID();
			if (arr[i].getEmployeeId() == searchId) {
				return arr[i];
			}
		}
		return null; // if no match
	}

	public boolean changeSalary(int employeeId, int newSalary) {
		Employee e = getEmployeeByID(employeeId);

		if (e != null) {
			e.setEmployeeSalary(newSalary);
			return true;
		} else
			return false;

	}
	
	
	public boolean allocateProject(Project p,int empId)
	{
		Employee e = getEmployeeByID(empId);

		if (e != null) {
			e.setProject(p);
			return true;
		} else
			return false;
	}
						
	public Employee[] getEMployeeBasedOnProject(String projectName)
	{
		
		Employee temp[] = new Employee[10]; // 10
		int count = 0;
		
		for (int i = 0; i < index; i++) {

			if(arr[i].getProject().getProjectName().equalsIgnoreCase(projectName))
			{
				temp[count++] = arr[i];
			}
			
		}
		return temp;
	}
	
	
	
	
	
	
	
	
	

	public Employee[] getArr() {
		return arr;
	}

	public void setArr(Employee[] arr) {
		this.arr = arr;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
