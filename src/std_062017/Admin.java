package std_062017;

import java.util.*;

public class Admin {
	/**
	 * Returns the average gpa for all students in the studentList
     */
	public static double computeAverageGpa(List<Student> studentList) {
		
		double sum=0.0;
		int s=studentList.size();
		
			for(int i=0;i<studentList.size();i++) {
				sum+=studentList.get(i).computeGpa();
			}
			
			double sum1=studentList.stream().mapToDouble(Student::computeGpa).average().getAsDouble();
		//return sum/s;
		return sum1;
		
	}
}
