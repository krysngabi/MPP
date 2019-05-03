package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Counter {
	
	 public static int countWords(List<String> words, char c, char d, int len) {
		 long counter=words.stream()
				 .filter(e->e.toString().length()==len)
				 .filter(e->e.contains(String.valueOf(c)))
				 .filter(e->!e.contains(String.valueOf(d))).count();
				
				 
				 
		 
		 return (int)counter;
		 
	 }
	 public static void main(String[]args) {
		 List<String> places = Arrays.asList("Buenos Aires", "Córdoba", "Plata","ngabi","Christian","Kika","Akani");
		 System.out.printf("Counter %d ",countWords(places, 'a', 'w', 5));
	 }


}
