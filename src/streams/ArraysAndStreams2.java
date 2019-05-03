package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class myComparator implements Comparator<String>{

	@Override
	public int compare(String s1,String s2) {
		 //
		return s2.toString().compareTo(s1.toString());
	}
	
}

public class ArraysAndStreams2
{
	
   public static void main(String[] args)
   {
      String[] strings = 
         {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};
      

       //display original strings
      System.out.printf("Original strings: %s%n", Arrays.asList(strings));

       //strings in uppercase
      System.out.printf("strings in uppercase: %s%n",
         Arrays.stream(strings)
               .map(String::toUpperCase)
               .collect(Collectors.toList()));

       //strings greater than "m" (case insensitive) sorted ascending
      System.out.printf("strings greater than m sorted ascending: %s%n",
         Arrays.stream(strings)
               .filter(s -> s.compareToIgnoreCase("m") > 0)
               .sorted(String.CASE_INSENSITIVE_ORDER)
               .collect(Collectors.toList()));

       //strings greater than "m" (case insensitive) sorted descending
      System.out.printf("strings greater than m sorted descending: %s%n",
         Arrays.stream(strings)
               .filter(s -> s.compareToIgnoreCase("m") > 0)
               .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
               .collect(Collectors.toList()));
      
      Comparator<Employee> employeeNameComparator
      = Comparator.comparing(
        Employee::getName, (s1, s2) -> {
            return s2.compareTo(s1);
        });
      
       //strings greater than "m" (case insensitive) sorted descending
      System.out.printf("strings greater than m sorted descending custom comparator: %s%n",
         Arrays.stream(strings)
               .filter(s -> s.compareToIgnoreCase("m") > 0)
               .sorted((a, b) -> a.compareTo(b))
               .collect(Collectors.toList()));
      
      

   }
}  //end class ArraysAndStreams2


