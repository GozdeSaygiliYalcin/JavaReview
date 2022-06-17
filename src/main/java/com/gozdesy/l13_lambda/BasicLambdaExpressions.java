package main.java.com.gozdesy.l13_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BasicLambdaExpressions {

	public static void main(String[] args) {
		// Basic lambda methods and their usement
		
		// Use a lamba expression in the ArrayList's forEach() method to print every item in the list:
		 ArrayList<Integer> numbers = new ArrayList<Integer>();
		    numbers.add(5);
		    numbers.add(9);
		    numbers.add(8);
		    numbers.add(1);
		    numbers.forEach( (n) -> { System.out.println(n); } );
		    
		    
		    List<String> names = Arrays.asList("gozde", "boncukcuk", "süt", "efdal");  //asList komutu sabit boyutlu bir liste döndürmek için kullanılır
			System.out.println(names);
			
			
			Collections.sort(names, (String a, String b) -> { //harfe göre listeyi sıralıyor
				return a.compareTo(b);});
				System.out.println(names);
			
			Collections.sort(names, (a,b) -> b.compareTo(a));
			System.out.println(names);

	}

}
