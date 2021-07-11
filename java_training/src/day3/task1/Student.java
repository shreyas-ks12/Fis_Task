package day3.task1;

public class Student {
	
	private String studentName;
	private int totalMarks;
	private boolean status; // true for pass , false for fail
	
	public Student() {
		super();
	}
	
	public Student(String name) {
		super();
		studentName = name;

	}
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public int getTotalMarks() {
		return totalMarks;
	}



	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}



	/*   business method*/
	public void giveExam(int newMarks)
	{
		// ---- more code to conduct and give exam
		totalMarks = newMarks; // marks will be updated 
		
		// performing business task 
		if(totalMarks<80) status = false;
		else status = true;
		
	}

}



















