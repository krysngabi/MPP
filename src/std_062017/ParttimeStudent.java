package std_062017;
import java.util.*;
public class ParttimeStudent extends Student {
	ParttimeTranscriptRecord pptr;
	String name;

	public ParttimeStudent(String name,ParttimeTranscriptRecord pptr) {
		super(name);
		this.pptr = pptr;
	}

	public ParttimeTranscriptRecord getPptr() {
		return pptr;
	}

	public void setPptr(ParttimeTranscriptRecord pptr) {
		this.pptr = pptr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	double computeGpa() {
		double sum=0.0;
		int s=pptr.grades.size();
		for(double gpa:pptr.grades) {
			sum+=gpa;
		}
		return pptr.grades.stream().mapToDouble(e->e.doubleValue()).average().getAsDouble();
		//return sum/s;
	}
	
	
}
