package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
	List<String> items = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
	
	List<String> filtered = items.parallelStream()
			.filter(item -> !item.isEmpty())
			.collect(Collectors.toList());
	filtered.forEach(System.out::println);
	
	List.of("This", "is", "created", "by", "stream()")
	.stream()
	.forEach(System.out:: print);

	}

}
