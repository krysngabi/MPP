package std_062017;

import java.util.List;
import java.util.stream.Stream;

public class FulltimeStudent extends Student {
	private String name;
	private FulltimeTranscriptRecord fftr;
	
	

	public FulltimeStudent(String name, FulltimeTranscriptRecord fftr) {
		super(name);
		this.fftr = fftr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FulltimeTranscriptRecord getFftr() {
		return fftr;
	}

	public void setFftr(FulltimeTranscriptRecord fftr) {
		this.fftr = fftr;
	}

	@Override
	double computeGpa() {
		double sum=0.0;
		int s1,s2;
		s1=fftr.getFallTranscript().grades.size();
		s2=fftr.getSpringTranscript().grades.size();
		
		for(double gpa1:fftr.getFallTranscript().grades) {
			sum+=gpa1;
		}
		for(double gpa2:fftr.getSpringTranscript().grades) {
			sum+=gpa2;
		}
double sum1=Stream.concat(fftr.getFallTranscript().grades.stream(),
				fftr.getSpringTranscript().grades.stream()).mapToDouble(e->e.doubleValue()).average().getAsDouble();


				
		//return sum/(s1+s2);
		return sum1;
	}
	
	
}
