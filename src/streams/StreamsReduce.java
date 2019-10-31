package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduce {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Chuck", "jim", "Adam", "Brain", "Dunae", "Alex");
		
		Optional<String> reduced = names.stream()
				.reduce((s1, s2) -> s1 + "#" + s2);
				
				reduced.ifPresent(System.out::println);

	}

}