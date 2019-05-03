package std_032018.prob2;

import java.util.ArrayList;
import java.util.List;

public class PlanOfStudy {
	List<Course>courses=new ArrayList<Course>();;
	
	
	
	PlanOfStudy() {
		//super();
		//System.out.println("Ba bengi nga");
		
	}


	public void addCourse(Course c) {
		courses.add(c);
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

}
