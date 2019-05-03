package std_062017;
import java.util.*;
public class ParttimeTranscriptRecord {
	List<Double>grades=new ArrayList<Double>();
	
	public void insertGrade(double gd) {
		grades.add(gd);
	}

	public List<Double> getGrades() {
		return grades;
	}

	public void setGrades(List<Double> grades) {
		this.grades = grades;
	}}
