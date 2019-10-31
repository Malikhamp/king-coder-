package streams;

import java.util.*;
public class StreamMap2 {

	public static void main(String[] args) {
		
		Map<String, String> books = new HashMap<>();
		books.put("978-0201633610", "Design patterns");
		books.put("978-1617291999" , "Java 8 in Action");
		books.put("978-0134685991", "Effective Java");
		
		
		//find the ISBN for the book with the title"Effective Java"
		
		Optional<String> optionalIsbn= books.entrySet().stream()
				.filter(e ->"Effective Java".equals(e.getValue()))
				.map(Map.Entry::getKey)
				.findFirst();
				optionalIsbn.ifPresent(System.out::println);
	}

}
