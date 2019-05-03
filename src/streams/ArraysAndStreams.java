package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraysAndStreams
{
   public static void main(String[] args)
   {
	   
	   String tetxe="ngabi kika";
	   System.out.println(tetxe.substring(1));
      Integer[] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};

       //display original values
      System.out.printf("Original values: %s%n", Arrays.asList(values));

      // sort values in ascending order with streams
      System.out.printf("Sorted values: %s%n", 
         Arrays.stream(values)
               .sorted()
               .collect(Collectors.toList()));

       //values greater than 4
      List<Integer> greaterThan4 =
         Arrays.stream(values)
               .filter(value -> value > 4)
               .collect(Collectors.toList());
      System.out.printf("Values greater than 4: %s%n", greaterThan4);
      
    //values greater than 4
      List<Integer> greaterThan41 =
    		  Arrays.asList(values).stream()
               .filter(value -> value > 4)
               .collect(Collectors.toList());
      System.out.printf("Values greater than 41: %s%n", greaterThan41);

      // filter values greater than 4 then sort the results
      System.out.printf("Sorted values greater than 4: %s%n",
         Arrays.stream(values)
               .filter(value -> value > 4)
               .sorted()
               .collect(Collectors.toList()));  //This list will go to the 
                                                //toString() method (JL).

       //greaterThan4 List sorted with streams
      System.out.printf(
         "Values greater than 4 (ascending with streams): %s%n",
         greaterThan4.stream()
               .sorted()
               .collect(Collectors.toList()));
   }
}  //end class ArraysAndStreams
