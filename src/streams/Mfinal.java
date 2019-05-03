package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Mfinal {

	public static void main(String[] args) {
		 //
		IntStream.iterate(1, i -> i + 2).limit(10).forEach(System.out::println);
		IntStream.iterate(9, i -> i + 2).limit(4).forEach(System.out::println);

		Stream strings = Stream.of("A", "good", "day", "to", "write", "some", "java");

		Optional strings1 = strings.reduce((x, y) -> x + " " + y);
		System.out.println(strings1.get());

		Employee[] employees = { new Employee("Jason", "Red", 5000, "IT"), 
				new Employee("Ashley", "Green", 7600, "IT"),
				new Employee("Matthew", "Indigo", 3587.5, "Sales"),
				new Employee("James", "Indigo", 4700.77, "Marketing"), 
				new Employee("Luke", "Indigo", 6200, "IT"),
				new Employee("Jason", "Blue", 3200, "Sales"), 
				new Employee("Wendy", "Brown", 4236.4, "Marketing") ,
				new Employee("Woles", "Jarule", 4236.4, "Marketing") };

		 //get List view of the Employees
		List<Employee> list = Arrays.asList(employees);
		
		 /*System.out.printf("%nEmployees by department:%n"); 
		 
	      Map<String, List<Employee>> groupedByDepartment =
	         list.stream()
	             .collect(Collectors.groupingBy(Employee::getDepartment));

	      groupedByDepartment.forEach(
	         (department, employeesInDepartment) -> 
	         {
	            System.out.println(department);
	            employeesInDepartment.forEach(
	               employee -> System.out.printf("   %s%n", employee));
	         }
	      );*/
		
	      
		 Stream.concat(Stream.concat(list.stream().filter(e->e.getFirstName().startsWith("W")).
	    		  map(Employee::getFirstName)
	    		  .sorted(String.CASE_INSENSITIVE_ORDER.reversed()), 
	    		  list.stream().filter(e->e.getFirstName().startsWith("L"))
	    		  ),list.stream().filter(f->f.getFirstName().startsWith("J"))).forEach(System.out::println);
	      

	}

}
