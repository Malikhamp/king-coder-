package methods;

import java.util.*;
/**
 * 
 * 1. Test Method Ref:: println
 * 
 *
 */

public class MethodReference {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Malik");
		names.add("Killa Mike");
		names.forEach(System.out::println);
		
		names.forEach(p -> System.out.println(p) ); //Lambda expression
		
	
		
	}

}
