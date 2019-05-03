package streams;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class myEmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1,Employee e2) {
		 //
		return e2.getFirstName().compareTo(e1.getName());
	}
	
}

public class ProcessingEmployees
{
   public static void main(String[] args)
   {
       //initialize array of Employees
      Employee[] employees = {
         new Employee("Jason", "Red", 5000, "IT"),
         new Employee("Ashley", "Green", 7600, "IT"),
         new Employee("Matthew", "Indigo", 3587.5, "Sales"),
         new Employee("James", "Indigo", 4700.77, "Marketing"),
         new Employee("Luke", "Indigo", 6200, "IT"),
         new Employee("Jason", "Blue", 3200, "Sales"),
         new Employee("Wendy", "Brown", 4236.4, "Marketing")};

      // get List view of the Employees
      List<Employee> list = Arrays.asList(employees);

      // display all Employees
      System.out.println("Complete Employee list:");
      list.stream().forEach(System.out::println); //  A method reference.
      
      List<Employee> list2 = Arrays.asList(employees);
      Collections.sort(list2, new myEmployeeComparator());

       //display all Employees
      System.out.println("\nComplete Employee list Ordered:");
      list2.stream().forEach(System.out::println);  // A method reference.
      
       //Predicate (boolean-valued function) that returns true for salaries 
      //in the range $4000-$6000
      Predicate<Employee> fourToSixThousand = 
         e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);

       //Display Employees with salaries in the range $4000-$6000
      // sorted into ascending order by salary
      System.out.printf(
         "%nEmployees earning $4000-$6000 per month sorted by salary:%n");

      list.stream()
          .filter(fourToSixThousand)
          .sorted(Comparator.comparing(Employee::getSalary))
          .forEach(System.out::println);

       //Display first Employee with salary in the range $4000-$6000
      System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
         list.stream()
             .filter(fourToSixThousand)
             .findFirst()
             .get());

      // Functions for getting first and last names from an Employee
      Function<Employee, String> byFirstName = Employee::getFirstName;
      Function<Employee, String> byLastName = Employee::getLastName;

       //Comparator for comparing Employees by first name then last name
      Comparator<Employee> lastThenFirst = 
         Comparator.comparing(byLastName).thenComparing(byFirstName);

      // sort employees by last name, then first name 
      System.out.printf(
         "%nEmployees in ascending order by last name then first:%n");
      list.stream()
          .sorted(lastThenFirst)
          .forEach(System.out::println);

       //sort employees in descending order by last name, then first name
      System.out.printf(
         "%nEmployees in descending order by last name then first:%n");
      list.stream()
          .sorted(lastThenFirst.reversed())
          .forEach(System.out::println);

       //display unique employee last names sorted
      System.out.printf("%nUnique employee last names:%n");
      list.stream()
          .map(Employee::getLastName)
          .distinct()
          .sorted()
          .forEach(System.out::println);

       //display only first and last names
      System.out.printf(
         "%nEmployee names in order by last name then first nameX:%n"); 
      list.stream()
          .sorted(lastThenFirst)
          .map(Employee::getName)
          .forEach(System.out::println);

       //group Employees by department
      System.out.printf("%nEmployees by department:%n"); 
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
      );
      System.out.printf("%nAverage salary by department:%n"); 
      
      groupedByDepartment.forEach(
    	         (department, employeesInDepartment) -> 
    	         {
    	            System.out.println(department);
    	            System.out.printf(" %.2f%n",employeesInDepartment.stream().mapToDouble(Employee::getSalary).average().getAsDouble());
    	            
    	         }
    	      );
      
 System.out.printf("%nMax salary by department:%n"); 
      
      groupedByDepartment.forEach(
    	         (department, employeesInDepartment) -> 
    	         {
    	            System.out.println(department);
    	            System.out.printf(" %.2f%n",employeesInDepartment.stream().mapToDouble(Employee::getSalary).max().getAsDouble());
    	            
    	         }
    	      );

       //count number of Employees in each department
      System.out.printf("%nCount of Employees by department:%n"); 

      Map<String, Long> employeeCountByDepartment =
         list.stream()
             .collect(Collectors.groupingBy(Employee::getDepartment, 
                TreeMap::new, Collectors.counting()));

      employeeCountByDepartment.forEach(
         (department, count) -> System.out.printf(
            "%s has %d employee(s)%n", department, count));

/*  Output looks something like :

        HR  4
        IT  8
        Sales  12
*/


      // sum of Employee salaries with DoubleStream sum method
      System.out.printf(
         "%nSum of Employees' salaries (via sum method): %.2f%n",
         list.stream()
             .mapToDouble(Employee::getSalary)
             .sum());

       //calculate sum of Employee salaries with Stream reduce method
      System.out.printf(
         "Sum of Employees' salaries (via reduce method): %.2f%n",
         list.stream()
             .mapToDouble(Employee::getSalary)
             .reduce(0, (value1, value2) -> value1 + value2));  

       //average of Employee salaries with DoubleStream average method
      System.out.printf("Average of Employees' salaries: %.2f%n",
         list.stream()
             .mapToDouble(Employee::getSalary)
             .average()
             .getAsDouble());  
      
      System.out.printf("Number of Lastnames beginning with B %d",
    	         list.stream()
    	             .map(Employee::getLastName)
    	             .filter(e->e.charAt(0)=='b' || e.charAt(0)=='B')
    	             .count()); 
      
      
      System.out.printf("\nList of Employees with lastname beginning with B %s",
 	         list.stream()
 	             .map(Employee::getLastName)
 	             .filter(e->(e.charAt(0)=='b' || e.charAt(0)=='B'))
 	             .collect(Collectors.toList()
 	            		 )); 
      
      List<Employee> lastbyB =
    	         list.stream()
    	         .filter(s -> s.getLastName().startsWith("B")||s.getLastName().startsWith("b"))
    	         .collect(Collectors.toList()) ;
      
      System.out.printf(
    	         "\nFirst and Lastname upper case \n\n");
      
      
      list.stream()
	   .filter(s -> s.getLastName().startsWith("B"))
      .map(emp ->{ 
    	  return 
    			  new Employee(emp.getFirstName().toUpperCase(), 
    		  emp.getLastName().toUpperCase(),emp.getSalary(),
    		  emp.getDepartment());
    	  })
      .forEach(System.out::println);
      
      System.out.printf(
 	         "\nLastname upper case \n\n");
   
   

list.stream()
.map(x-> {
	if(x.getLastName().startsWith("B")) {
	return new Employee(x.getFirstName(), x.getLastName().toUpperCase(),x.getSalary(),x.getDepartment());
	}else {
		return new Employee(x.getFirstName(), x.getLastName(),x.getSalary(),x.getDepartment());

	}
	})
.forEach(System.out::println);

Stream<Employee> mstr=list.stream()
.map(x-> {
	if(x.getLastName().startsWith("B")) {
	return new Employee(x.getFirstName(), x.getLastName().toUpperCase(),x.getSalary(),x.getDepartment());
	}else {
		return new Employee(x.getFirstName(), x.getLastName(),x.getSalary(),x.getDepartment());

	}
	//return new Employee(x.getFirstName(), x.getLastName(),x.getSalary(),x.getDepartment());
	});
Stream<Employee> mstr1=list.stream()
.map(x-> {
	if(x.getLastName().startsWith("B")) {
	return new Employee(x.getFirstName(), x.getLastName().toUpperCase(),x.getSalary(),x.getDepartment());
	}else {
		return new Employee(x.getFirstName(), x.getLastName(),x.getSalary(),x.getDepartment());

	}
	//return new Employee(x.getFirstName(), x.getLastName(),x.getSalary(),x.getDepartment());
	});





System.out.println(
        "\nJoining in Employees \n\n"+
mstr
.map( Employee::toString)
.collect(Collectors.joining()));

System.out.println(
        "\nJoining in Employees with separator\n\n"+
mstr1
.map( Employee::toString)
.collect(Collectors.joining("---\n---")));




System.out.printf(
         "\nEmploying with Last Name starting with I, sorted and without duplicate upper case \n\n");

list.stream()
.filter(s -> s.getLastName().startsWith("I")||s.getLastName().startsWith("i"))
.map(e->e.getLastName())
.sorted()
.distinct()
.forEach(System.out::println);

System.out.printf(
        "\nAverage of Salary %.1f\n",
list.stream()
.map(e->e.getSalary()/list.size())
.reduce(0.0, (x,y)->x+y)
.doubleValue());

System.out.printf(
        "\nAverage of Salary %.1f\n",
list.stream()
.mapToDouble(Employee::getSalary)
.average().getAsDouble());

System.out.printf(
        "\nAverage of Salary %.1f\n",
list.stream()
.collect(Collectors.averagingDouble(Employee::getSalary)));

System.out.printf(
        "\nTotal of Salary %.1f\n",
list.stream()
.map(e->e.getSalary())
.reduce(0.0, (x,y)->x+y)
.doubleValue());

System.out.printf(
        "\nFirstname of All Employees\n\n");

list.stream()
.map(e->e.getFirstName())
.forEach(System.out::println);

System.out.printf(
        "\nInfinite even numbers print the 20 first\n\n");
IntStream 

.iterate(0, i -> i + 2)
.limit(20)
.forEach(System.out::println); 

        	 
   
   }
}  





