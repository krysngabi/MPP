package std_032017_streams;

import java.util.List;
import java.util.stream.Collectors;

public class Admin {
	//return new Student(st.getName(), st.getGpa(), st.getMajor());
	public static List<Student> obtainHonorRoll(List<Student> list) {
			return list.stream()
					.filter(st->st.getGpa()>3.0)
					.filter(st->st.getMajor().equalsIgnoreCase("computer science"))
					.map(st->{return new Student(st.getName(), st.getGpa(), st.getMajor());}).collect(Collectors.toList());
		
	}
}
