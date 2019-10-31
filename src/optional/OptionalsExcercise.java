package optional;
import java.util.*;
import java.util.stream.Collectors;
public class OptionalsExcercise {

	public static void main(String[] args) {
		List<Optional<String>> listOfOptional = Arrays.asList(
				Optional.empty(),Optional.of("foo"), Optional.empty(),Optional.of("bar"));
		//-create a stream based on listOfOptionals
		//- filter list based on Optional having a value
		//-get the values from filtered Optional
		//-collect them into a List
		//-display the final
		
		List<String> filteredList = listOfOptional.stream()
				//.filter(Optional:: isPresent
				.filter(e->e.isPresent())
				.map(Optional::get)
				//.map(e -> e.get())
				.collect(Collectors.toList());
		filteredList.forEach(System.out::println);
	}

}
