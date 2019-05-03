package std_032018.prob2;

public class Course {
	private String courseTitle,primaryProfessor;
	
	public Course(String courseTitle, String primaryProfessor) {
		super();
		this.courseTitle = courseTitle;
		this.primaryProfessor = primaryProfessor;
	}

	

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public String getPrimaryProfessor() {
		return primaryProfessor;
	}

	public void setPrimaryProfessor(String primaryProfessor) {
		this.primaryProfessor = primaryProfessor;
	}

	@Override
	public String toString() {
		
		 return courseTitle + ": " + primaryProfessor;
		
		//return null;
	}
}
