package day2;

public class Project {
	
	private String projectName;
	private String techName;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(String projectName, String techName) {
		super();
		this.projectName = projectName;
		this.techName = techName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getTechName() {
		return techName;
	}
	public void setTechName(String techName) {
		this.techName = techName;
	}
	
	

}
